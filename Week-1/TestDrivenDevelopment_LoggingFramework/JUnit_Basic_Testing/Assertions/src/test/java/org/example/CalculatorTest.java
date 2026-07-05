package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAssertEquals() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(20, calculator.add(5, 5));
    }

    @Test
    void testAssertTrue() {
        assertTrue(calculator.isPositive(10));
    }

    @Test
    void testAssertFalse() {
        assertFalse(calculator.isPositive(-10));
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(calculator.getMessage());
    }

    @Test
    void testAssertNull() {
        assertNull(calculator.getNullValue());
    }
}