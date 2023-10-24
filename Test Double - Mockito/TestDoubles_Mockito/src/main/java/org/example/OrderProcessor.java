package org.example;

public class OrderProcessor  {
    private final PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean processOrder(double amount) {
        // Logica di elaborazione dell'ordine
        return paymentService.chargePayment(amount);
    }

}
