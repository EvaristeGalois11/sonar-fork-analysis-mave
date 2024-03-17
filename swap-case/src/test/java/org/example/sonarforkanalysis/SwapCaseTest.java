package org.example.sonarforkanalysis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapCaseTest {
    private final SwapCase swapCase = new SwapCase();

    @MethodSource
    @ParameterizedTest
    void swapCaseTest(String str, String expected) {
        var result = swapCase.swapCase(str);
        assertEquals(expected, result);
    }

    public static List<Arguments> swapCaseTest() {
        return List.of(
                Arguments.of("string", "STRING"),
                Arguments.of("String", "sTRING"),
                Arguments.of("STRINg", "strinG"),
                Arguments.of("STRING", "string"),
                Arguments.of("", "")
        );
    }
}