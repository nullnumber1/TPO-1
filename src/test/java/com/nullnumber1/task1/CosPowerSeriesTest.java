package com.nullnumber1.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosPowerSeriesTest {
    @DisplayName("Test cos(x) function")
    @ParameterizedTest(name = "Test {index}: x={0}, n={1}, expected={2}")
    @MethodSource("testCases")
    void testCosineFunction(double x, int n, double expected) {
        double result = CosPowerSeries.calculate(x, n);
        assertEquals(expected, result, 0.1);
    }

    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                { 0, 0, 1 },
                { Math.PI / 2, 0, 1 },
                { Math.PI / 2, 1, 0 },
                { Math.PI / 2, 2, -0.5 },
                { Math.PI / 2, 3, 0 },
                { Math.PI / 2, 4, 0.0417 },
                { Math.PI, 0, -1 },
                { Math.PI, 1, 0 },
                { Math.PI, 2, 1 },
                { Math.PI, 3, 0 },
                { Math.PI, 4, -0.0417 },
                { -Math.PI / 2, 0, 1 },
                { -Math.PI / 2, 1, 0 },
                { -Math.PI / 2, 2, -0.5 },
                { -Math.PI / 2, 3, 0 },
                { -Math.PI / 2, 4, 0.0417 },
                { Double.NaN, 0, Double.NaN },
                { Double.POSITIVE_INFINITY, 0, Double.NaN },
                { Double.NEGATIVE_INFINITY, 0, Double.NaN },
        });
    }
}
