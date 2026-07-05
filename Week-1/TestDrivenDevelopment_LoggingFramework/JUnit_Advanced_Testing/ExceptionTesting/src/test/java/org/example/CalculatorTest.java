package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testDivision() {

        assertEquals(5, calculator.divide(10, 2));

    }

    @Test
    void testDivisionByZero() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Cannot divide by zero", exception.getMessage());

    }
}