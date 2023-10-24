package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



public class OrderProcessorTest {

    @Test
    public void testProcessOrderWithSuccessfulPayment() {
        // Creiamo un mock per il PaymentService
        PaymentService paymentService = Mockito.mock(PaymentService.class);

        // Configuriamo il mock per simulare un pagamento riuscito
        when(paymentService.chargePayment(anyDouble())).thenReturn(true);

        // Creiamo un'istanza di OrderProcessor con il mock PaymentService
        OrderProcessor orderProcessor = new OrderProcessor(paymentService);

        // Eseguiamo il metodo che vogliamo testare
        boolean result = orderProcessor.processOrder(100.0);

        // Verifichiamo che il pagamento sia stato effettuato con successo
        assertTrue(result);

        // Verifichiamo che il metodo chargePayment sia stato chiamato con l'importo corretto
        verify(paymentService).chargePayment(100.0);
    }

    @Test
    public void testProcessOrderWithFailedPayment() {

        // Creiamo un mock per il PaymentService
        PaymentService paymentService = Mockito.mock(PaymentService.class);

        // Configuriamo il mock per simulare un pagamento fallito
        when(paymentService.chargePayment(anyDouble())).thenReturn(false);

        // Creiamo un'istanza di OrderProcessor con il mock PaymentService
        OrderProcessor orderProcessor = new OrderProcessor(paymentService);

        // Eseguiamo il metodo che vogliamo testare
        boolean result = orderProcessor.processOrder(200.0);

        // Verifichiamo che il pagamento sia fallito
        assertFalse(result);

        // Verifichiamo che il metodo chargePayment sia stato chiamato con l'importo corretto
        verify(paymentService).chargePayment(200.0);
    }
}
