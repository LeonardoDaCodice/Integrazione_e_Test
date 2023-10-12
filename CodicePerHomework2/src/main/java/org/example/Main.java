package org.example;

public class Main {
    public static void main(String[] args) {

/*
        //Esempi di input sul primo metodo "Concatenate"
        StringManipulator manipulator = new StringManipulator();


        String result1 = manipulator.concatenate("Hello, ", "world!"); // Concatena due stringhe non nulle
        System.out.println("Risultato1: "+ result1); // Stampa "Hello, world!"


        try {
            String result2 = manipulator.concatenate(null, "world!"); // Tentativo di concatenare con un input nullo
        } catch (IllegalArgumentException e) {
            System.out.println("Risultato2 -Errore: " + e.getMessage()); // Stampa un messaggio di errore
        }


        try {
            String result3 = manipulator.concatenate("Hello, ", null); // Tentativo di concatenare con un input nullo
        } catch (IllegalArgumentException e) {
            System.out.println("Risultato3 -Errore: " + e.getMessage()); // Stampa un messaggio di errore
        }


        try {
            String result4 = manipulator.concatenate(null, null); // Tentativo di concatenare con entrambi gli input nulli
            System.out.println("Risultato4: " + result4); // Stampa "Risultato4: Errore: Input strings cannot be null"
        } catch (IllegalArgumentException e) {
            System.out.println("Risultato4 -Errore: " + e.getMessage()); // Stampa un messaggio di errore
        }
*/

/*

        // Creazione di un'istanza di StringManipulator
        StringManipulator stringManipulator = new StringManipulator();

        // Test 1: Inversione di una stringa non nulla
        try {
            String str1 = "Hello, World!";
            String reversed1 = stringManipulator.reverse(str1);
            System.out.println("Risultato1: " + reversed1);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }

        // Test 2: Inversione di una stringa vuota
        try {
            String str2 = "";
            String reversed2 = stringManipulator.reverse(str2);
            System.out.println("Risultato2: " + reversed2);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }

        // Test 3: Inversione di una stringa nulla
        try {
            String str3 = null;
            String reversed3 = stringManipulator.reverse(str3);
            System.out.println("Risultato3: " + reversed3);
        } catch (IllegalArgumentException e) {
            System.out.println("Risultato3: Eccezione---> " + e.getMessage());
        }
 */

        StringManipulator stringManipulator = new StringManipulator();

        // Esempio di stringhe da verificare come palindromi
        String palindromo1 = "radar";
        String palindromo2 = "computer";
        String nonPalindromo = "";
        String nullString = null;

        // Verifica se le stringhe sono palindrome o meno
        boolean isPalindromo1 = stringManipulator.isPalindrome(palindromo1);
        boolean isPalindromo2 = stringManipulator.isPalindrome(palindromo2);
        boolean isNonPalindromo = stringManipulator.isPalindrome(nonPalindromo);


        // Stampa i risultati
        System.out.println("Risultato1 :'" + palindromo1 + "' è un palindromo? ---> " + isPalindromo1);
        System.out.println("Risultato2 :'" + palindromo2 + "' è un palindromo? ---> " + isPalindromo2);
        System.out.println("Risultato3 :'" + nonPalindromo + "' è un palindromo? ---> " + isNonPalindromo);

        try {
            boolean isNullString = stringManipulator.isPalindrome(nullString);
            System.out.println("Risultato4 :'" + nullString + "' è un palindromo? ---> " + isNullString);
        }catch(IllegalArgumentException e){
            System.out.println("Risultato4 : Eccezione ---> "+e.getMessage());

        }

    }
}