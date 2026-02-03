package com.poly;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppParameterizedTest {
    App app = new App();

    @ParameterizedTest(name="Số {0} là số chẵn: {1} ")
    //@ValueSource(ints = {2,4,6,8,10})
    @CsvSource({
            "1, false",
            "2, true",
            "3, false",
            "4, true",
            "5, false",
            "6, true",
            "7, false",
            "8, true",
            "9, false",
            "10, true"
    })
    void isEvenNumberParamTest(int number, boolean expected) {
        assertEquals(expected, app.isEven(number));
    }
}
