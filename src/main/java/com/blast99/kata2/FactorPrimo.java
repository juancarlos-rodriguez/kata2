package com.blast99.kata2;

public class FactorPrimo {

    public boolean esPrimo(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
