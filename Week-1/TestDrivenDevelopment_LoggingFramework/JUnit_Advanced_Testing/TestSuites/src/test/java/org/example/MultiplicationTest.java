package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    Calculator calculator = new Calculator();

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(5, 4));
    }
}