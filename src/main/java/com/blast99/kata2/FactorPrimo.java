package com.blast99.kata2;

public class FactorPrimo {

    public boolean esPrimo(int number) {
        if (number == 1) return false;
        if (number == 0) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
