package com.blast99.kata2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

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
        ArrayList<Integer> listaEsperada = new ArrayList<>();

        Assert.assertArrayEquals("La lista no es correcta", listaEsperada, instance.listaDeNumPrimos(10));

    }

}
