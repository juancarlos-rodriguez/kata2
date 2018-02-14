package com.blast99.kata2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorPrimoTests {

    @Test
    public void testEsPrimo() {
        FactorPrimo instance = new FactorPrimo();

        Assert.assertFalse("El numero es primo", instance.esPrimo(0));

    }

}
