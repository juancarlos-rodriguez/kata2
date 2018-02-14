package com.blast99.kata2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorPrimoTests {

    @Test
    public void testEsPrimo() {
        FactorPrimo instance = new FactorPrimo();

        Assert.assertTrue("El numero es no primo", instance.esPrimo(2));
        Assert.assertTrue("El numero es no primo", instance.esPrimo(3));
        Assert.assertTrue("El numero es no primo", instance.esPrimo(5));
        Assert.assertTrue("El numero es no primo", instance.esPrimo(7));
        Assert.assertTrue("El numero es no primo", instance.esPrimo(11));

        Assert.assertFalse("El numero es primo", instance.esPrimo(-10));
        Assert.assertFalse("El numero es primo", instance.esPrimo(0));
        Assert.assertFalse("El numero es primo", instance.esPrimo(1));
        Assert.assertFalse("El numero es primo", instance.esPrimo(4));
        Assert.assertFalse("El numero es primo", instance.esPrimo(6));
        Assert.assertFalse("El numero es primo", instance.esPrimo(8));
        Assert.assertFalse("El numero es primo", instance.esPrimo(9));


    }

    @Test
    public void testListaDeNumPrimos() {
        FactorPrimo instance = new FactorPrimo();

        ArrayList<Integer> listaEsperada19 = new ArrayList<>(Arrays.asList(2, 3, 5, 7 ,11 ,13, 17, 19));
        Assert.assertEquals("Las listas no coinciden", listaEsperada19, instance.listaDeNumPrimos(19));

        ArrayList<Integer> listaEsperada1 = new ArrayList<>();
        Assert.assertEquals("Las listas no coinciden", listaEsperada1, instance.listaDeNumPrimos(1));

        ArrayList<Integer> listaEsperadaMenos15 = new ArrayList<>();
        Assert.assertEquals("Las listas no coinciden", listaEsperadaMenos15, instance.listaDeNumPrimos(-15));

        ArrayList<Integer> listaEsperada107 = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107));
        Assert.assertEquals("Las listas no coinciden", listaEsperada107, instance.listaDeNumPrimos(107));

    }

    @Test
    public void testGenerate() {
        FactorPrimo instance = new FactorPrimo();

        ArrayList<Integer> listaEsperadaFactoresPrimos2 = new ArrayList<>(Arrays.asList(2));
        Assert.assertEquals("Las listas no coinciden", listaEsperadaFactoresPrimos2, instance.generate(2));

        ArrayList<Integer> listaEsperadaFactoresPrimos180 = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 5));
        Assert.assertEquals("Las listas no coinciden", listaEsperadaFactoresPrimos180, instance.generate(180));

        ArrayList<Integer> listaEsperadaFactoresPrimos306 = new ArrayList<>(Arrays.asList(2, 3, 3, 17));
        Assert.assertEquals("Las listas no coinciden", listaEsperadaFactoresPrimos306, instance.generate(306));

        ArrayList<Integer> listaEsperadaFactoresPrimos4620 = new ArrayList<>(Arrays.asList(2, 2, 3, 5, 7, 11));
        Assert.assertEquals("Las listas no coinciden", listaEsperadaFactoresPrimos4620, instance.generate(4620));

    }

}
