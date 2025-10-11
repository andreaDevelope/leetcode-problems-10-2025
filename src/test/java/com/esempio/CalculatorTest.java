package com.esempio;

import org.junit.Test;
import static org.junit.Assert.*;

//Test per la classe Calculator.

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals("La somma di 2 e 3 dovrebbe essere 5", 5, calculator.add(2, 3));
        assertEquals("La somma di -1 e 1 dovrebbe essere 0", 0, calculator.add(-1, 1));
        assertEquals("La somma di 0 e 0 dovrebbe essere 0", 0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals("La sottrazione di 5 e 3 dovrebbe essere 2", 2, calculator.subtract(5, 3));
        assertEquals("La sottrazione di 1 e 1 dovrebbe essere 0", 0, calculator.subtract(1, 1));
        assertEquals("La sottrazione di 0 e 5 dovrebbe essere -5", -5, calculator.subtract(0, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals("La moltiplicazione di 2 e 3 dovrebbe essere 6", 6, calculator.multiply(2, 3));
        assertEquals("La moltiplicazione di -2 e 3 dovrebbe essere -6", -6, calculator.multiply(-2, 3));
        assertEquals("La moltiplicazione di 0 e 5 dovrebbe essere 0", 0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals("La divisione di 6 e 2 dovrebbe essere 3.0", 3.0, calculator.divide(6, 2), 0.001);
        assertEquals("La divisione di 5 e 2 dovrebbe essere 2.5", 2.5, calculator.divide(5, 2), 0.001);
        assertEquals("La divisione di -6 e 2 dovrebbe essere -3.0", -3.0, calculator.divide(-6, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }
}
