package org.example;

public class StringManipulator {

    // Metodo per concatenare due stringhe non nulle e restituire il risultato.
    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }
        return str1 + str2;
    }


    // Metodo per invertire una stringa non nulla e restituire il risultato.
    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }


    // Metodo per verificare se una stringa è un palindromo.
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        // Rimuove i caratteri non alfabetici e converte tutto in minuscolo.
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Inverte la stringa pulita.
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        // Verifica se la stringa pulita invertita è uguale alla stringa pulita originale.
        return cleanStr.equals(reversedStr);
    }

}
