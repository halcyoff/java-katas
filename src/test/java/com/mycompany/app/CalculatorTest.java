package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(1, 1), 1 + 1);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.subtract(2, 1), 1);
    }

    @Test
    public void  mutliply() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.multiply(3, 3), 3*3);
    }
}
