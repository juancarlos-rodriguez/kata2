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
    public void testListaDeNumPrimos(){
        FactorPrimo instance = new FactorPrimo();
        ArrayList<Integer> listaEsperada19 = new ArrayList<>(Arrays.asList(2, 3, 5, 7 ,11 ,13, 17, 19));

        Assert.assertEquals("Las listas no coinciden", listaEsperada19, instance.listaDeNumPrimos(19));

    }

}
