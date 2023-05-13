package com.automation.one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {

    Calculator calculator;

    // Initialize the Calculator class before each test case and set it to null after each test case to ensure clean state.
    @BeforeMethod
    public void beforeMethod() {
        // TODO complete the method
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterMethod() {
        // TODO complete the method
        calculator = null;
    }

    // Positive test cases
    // Test the addition method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testAddition() {
        // TODO complete the test
        assertEquals(calculator.add(2, 2), 4);
    }

    // Test the subtraction method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testSubtraction() {
        // TODO complete the test
        assertEquals(calculator.subtract(10, 1), 9);
    }

    // Test the multiplication method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testMultiplication() {
        // TODO complete the test
        assertEquals(calculator.multiply(5, 6), 30);
    }

    // Test the division method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testDivision() {
        // TODO complete the test
        assertEquals(calculator.divide(10, 5), 2);
    }

    // Test the division method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testDivisionWithDouble() {
        // TODO complete the test
        assertEquals(calculator.divide(2.0, 2.0),1);
    }

    // Test the mod method of the Calculator class using a positive test case with valid inputs and assert that the output is correct.
    @Test
    public void testMod() {
        // TODO complete the test
        assertEquals(calculator.mod(100, 50), 0);
    }

    // Negative test cases
    // Test the division method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test
    public void testDivisionByZero() {
        // TODO complete the test
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    // Test the division method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test
    public void testDivisionByZeroWithDouble() {
        // TODO complete the test
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    // Test the mod method of the Calculator class using a negative test case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test
    public void testModByZero() {
        // TODO complete the test
        assertThrows(ArithmeticException.class, () -> calculator.mod(9, 0));
    }
}