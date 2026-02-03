package com.poly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    //assertAll
    @Test
    void testAllOperations() {

        assertAll("Test all calculator functions",

                () -> assertEquals(8.0, calculator.add(5, 3), "Add failed"),

                () -> assertEquals(6.0, calculator.subtract(10, 4), "Subtract failed"),

                () -> assertEquals(6.0, calculator.multiply(2, 3), "Multiply failed"),

                () -> assertEquals(5.0, calculator.divide(10, 2), "Divide failed"),

                () -> assertEquals(3.14, calculator.parseNumber("3.14"), "Parse failed")
        );
    }

    // Test chia cho 0 → ArithmeticException
    @Test
    public void testDivideByZero() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Không thể chia cho 0", ex.getMessage());
    }

    // Test nhập chuỗi không phải số → NumberFormatException
    @Test
    public void testParseInvalidNumber() {
        assertThrows(
                NumberFormatException.class,
                () -> calculator.parseNumber("abc")
        );
    }

    // Test truyền null → NullPointerException
    @Test
    public void testParseNull() {
        assertThrows(
                NullPointerException.class,
                () -> calculator.parseNumber(null)
        );
    }

    @Test
    public void testDivideSuccess() {
        double result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}
