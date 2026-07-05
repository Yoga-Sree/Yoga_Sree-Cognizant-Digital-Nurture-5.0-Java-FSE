package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @Order(1)
    void testAddition() {

        System.out.println("Running Addition Test");

        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    @Order(2)
    void testSubtraction() {

        System.out.println("Running Subtraction Test");

        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    @Order(3)
    void testMultiplication() {

        System.out.println("Running Multiplication Test");

        assertEquals(50, calculator.multiply(10, 5));
    }
}