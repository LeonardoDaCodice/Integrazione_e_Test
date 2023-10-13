package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class LinkedListTest {
    private LinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new LinkedList<>();
    }

    @Nested
    @Order(1)
    @DisplayName("Test Metodo -> add()")
    class FirstMethodTest{
            @Test
            @DisplayName("T1 - Aggiunta di un elemento in una lista vuota")
            public void testAddEmptyList() {
                list.add(1);
                assertEquals(1, list.size());
                assertEquals(Integer.valueOf(1), list.get(0));
            }
            @Test
            @DisplayName("T2 - Aggiunta di elementi consecutivi")
            public void testAddConsecutiveElements() {
                list.add(1);
                list.add(2);
                assertEquals(2, list.size());
                assertEquals(Integer.valueOf(1), list.get(0));
                assertEquals(Integer.valueOf(2), list.get(1));
            }
            @Test
            @DisplayName("T3 - Aggiunta di elementi duplicati")
            public void testAddDuplicateElements() {
                list.add(2);
                list.add(2);
                assertEquals(2, list.size());
                assertEquals(Integer.valueOf(2), list.get(1));
            }
    }

    @Nested
    @Order(2)
    @DisplayName("Test Metodo -> remove()")
    class SecondMethodTest {
        @Test
        @DisplayName("T4 - Rimozione di un elemento esistente dalla lista")
        public void testRemoveExistingElement() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertTrue(list.remove(2));
            assertEquals(2, list.size());
        }

        @Test
        @DisplayName("T5 - Tentativo di rimuovere un elemento non presente nella lista")
        public void testRemoveNonExistentElement() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertFalse(list.remove(4));
            assertEquals(3, list.size());
        }

        @Test
        @DisplayName("T5.1 - Rimozione di un elemento dalla testa della lista")
        public void testRemoveFromHead() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertTrue(list.remove(1));
            assertEquals(2, list.size());

            assertEquals(Integer.valueOf(2), list.get(0));
            assertEquals(Integer.valueOf(3), list.get(1));
        }

        @Test
        @DisplayName("T5.2 - Rimozione elemento da una lista vuota")
        public void testRemoveFromEmptyList(){
            assertFalse(list.remove(1));
            assertEquals(0, list.size());
        }
    }

    @Nested
    @Order(3)
    @DisplayName("Test Metodo -> get()")
    class ThirdMethodTest {
        @Test
        @DisplayName("T6 - Ottieni un elemento esistente dalla lista")
        public void testGetExistingElement() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertEquals(2, list.get(1));
        }

        @Test
        @DisplayName("T7 - Tentativo di ottenere un elemento da una posizione non valida")
        public void testGetInvalidIndex() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        }

        @Test
        @DisplayName("T7.1 - Tentativo di ottenere un elemento da una lista vuota")
        public void testGetFromEmptyList() {
            assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        }

        @Test
        @DisplayName("T7.2 - Tentativo di ottenere un elemento da una posizione negativa")
        public void testGetFromNegativeIndex() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        }

        @Test
        @DisplayName("T7.3 - Tentativo di ottenere un elemento da una posizione maggiore della dimensione")
        public void testGetFromIndexGreaterThanSize() {
            list.add(1);
            list.add(2);
            list.add(3);

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
        }
    }

    @Nested
    @Order(4)
    @DisplayName("Test Metodi -> size(), isEmpty() & NodeConstructor()")
    class Fourth_FifthMethodTest {
        @Test
        @DisplayName("T8 - testSizeAndIsEmpty()")
        public void testSizeAndIsEmpty() {
            assertTrue(list.isEmpty());
            list.add(1);
            assertFalse(list.isEmpty());
            assertEquals(1, list.size());
            list.remove(1);
            assertTrue(list.isEmpty());
            assertEquals(0, list.size());
        }

        @Test
        @DisplayName("T9 - testNodeConstructor()")
        public void testNodeConstructor() {
            Integer testData = 42;
            LinkedList<Integer>.Node<Integer> node = list.new Node<Integer>(testData);
            assertEquals(testData, node.getData());
            assertNull(node.getNext());
        }
    }
}