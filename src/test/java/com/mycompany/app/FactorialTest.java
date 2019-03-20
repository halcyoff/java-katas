package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void factorialTest() {
        assertEquals(Factorial.getFactorial(1), 1);
        assertEquals(Factorial.getFactorial(2), 2 * 1);
        assertEquals(Factorial.getFactorial(3), 3 * 2 * 1);
    }
}
