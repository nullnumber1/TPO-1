package com.nullnumber1.task2;

import java.util.List;

public class HeapSort {
    // TODO: fix corner cases
    public static List<Integer> sort(List<Integer> list) {
        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            heapify(list, i, 0);
        }
        return list;
    }

    private static void heapify(List<Integer> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && list.get(left) > list.get(largest))
            largest = left;

        if (right < n && list.get(right) > list.get(largest))
            largest = right;

        if (largest != i) {
            int temp = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, temp);
            heapify(list, n, largest);
        }
    }
}
