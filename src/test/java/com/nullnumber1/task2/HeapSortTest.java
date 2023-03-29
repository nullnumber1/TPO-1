package com.nullnumber1.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {

    public static Collection<Object[]> sortTestCases() {
        return Arrays.asList(new Object[][] {
                { "Empty list", Arrays.asList(), Arrays.asList() },
                { "Single element", Arrays.asList(1), Arrays.asList(1) },
                { "Two elements", Arrays.asList(2, 1), Arrays.asList(1, 2) },
                { "Multiple elements", Arrays.asList(5, 6, 1, 3, 2, 4), Arrays.asList(1, 2, 3, 4, 5, 6) },
                { "All elements same", Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 1) },
                { "Already sorted", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) },
                { "Reverse sorted", Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) }
        });
    }

    @DisplayName("Test heap sort function")
    @ParameterizedTest(name = "Test {index}: {0}")
    @MethodSource("sortTestCases")
    void testHeapSort(String testName, List<Integer> input, List<Integer> expected) {
        List<Integer> result = HeapSort.sort(input);
        assertEquals(expected, result);
    }

    public static Collection<Object[]> heapifyTestCases() {
        return Arrays.asList(new Object[][] {
                { "Max-heap", Arrays.asList(1, 4, 5, 6, 8), Arrays.asList(5, 4, 1, 6, 8) },
                { "Partial max-heap", Arrays.asList(1, 5, 2, 4, 3), Arrays.asList(5, 4, 2, 1, 3) }
        });
    }

    @DisplayName("Test heapify function")
    @ParameterizedTest(name = "Test {index}: {0}")
    @MethodSource("heapifyTestCases")
    void testHeapify(String testName, List<Integer> input, List<Integer> expected) {
        HeapSort.heapify(input, input.size(), 0);
        assertEquals(expected, input);
    }
}
