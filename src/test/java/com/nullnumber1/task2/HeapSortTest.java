package com.nullnumber1.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {

    @DisplayName("Test heap sort function")
    @ParameterizedTest(name = "Test {index}: input={0}, expected={1}")
    @MethodSource("testCases")
    void testHeapSort(List<Integer> input, List<Integer> expected) {
        List<Integer> result = HeapSort.sort(input);
        assertEquals(expected, result);
    }

    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { Arrays.asList(), Arrays.asList() },
                { Arrays.asList(1), Arrays.asList(1) },
                { Arrays.asList(2, 1), Arrays.asList(1, 2) },
                { Arrays.asList(3, 2, 1), Arrays.asList(1, 2, 3) },
                { Arrays.asList(5, 6, 1, 3, 2, 4), Arrays.asList(1, 2, 3, 4, 5, 6) },
                { Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 1) },
                { Arrays.asList(4, 4, 4, 4), Arrays.asList(4, 4, 4, 4) },
                { Arrays.asList(2, 1, 2, 1), Arrays.asList(1, 1, 2, 2) },
                { Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) },
                { Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) }
        });
    }
}
