package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        assertEquals(1, FactorialApp.calculateFactorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, FactorialApp.calculateFactorial(1));
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, FactorialApp.calculateFactorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialApp.calculateFactorial(-1);
    }
}