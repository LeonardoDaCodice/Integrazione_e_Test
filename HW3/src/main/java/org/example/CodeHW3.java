package org.example;

public class CodeHW3 {

    //Pari o Dispari
    public static boolean evenOrOdd(int value){
        if(value % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //Numero Primo o numero non Primo
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
