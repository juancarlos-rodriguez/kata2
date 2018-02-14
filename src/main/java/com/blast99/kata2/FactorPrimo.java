package com.blast99.kata2;

import java.util.ArrayList;

public class FactorPrimo {

    public boolean esPrimo(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> listaDeNumPrimos(int number) {

        ArrayList<Integer> listaPrimos = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            if (esPrimo(i)) {
                listaPrimos.add(i);
            }
        }

        return listaPrimos;

    }

    public ArrayList<Integer> generate(int number) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();

        for (int primo : listaDeNumPrimos(number)) {
            while (number % primo == 0) {
                factoresPrimos.add(primo);
                number = number / primo;
            }
        }

        return factoresPrimos;
    }
}
