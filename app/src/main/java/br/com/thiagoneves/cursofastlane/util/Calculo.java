package br.com.thiagoneves.cursofastlane.util;

public class Calculo {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (isEven(number)) {
            return false;
        }
        for(int i=3;i*i<=number;i+=2) {
            if(number%i==0)
                return false;
        }
        return true;
    }
}
