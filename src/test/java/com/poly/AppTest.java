package com.poly;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */

    @Test
    public void iEvenNumberTrueTest() {
        App app = new App();
        assertTrue(app.isEven(4), "4 is an even number");
        assertTrue(app.isEven(6), "6 is an even number");
    }


    @Test
    public void isEvenNumberFalseTest() {
        App app = new App();
        assertFalse(app.isEven(-1), "-1 is an odd number");
        assertFalse(app.isEven(5), "5 is an odd number");
    }
}
