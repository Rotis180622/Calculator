package com.poly;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class numberUnitTest {
        @ParameterizedTest
        @CsvSource({
                "1, true",
                "10, true",
                "100, true",
                "0, false",
                "-1, false",
                "-10, false"
        })
        void testIsPositiveInteger(int input, boolean expected) {
            boolean actual = NumberUtils.isPositiveInteger(input);
            assertEquals(expected, actual);
        }
    }


