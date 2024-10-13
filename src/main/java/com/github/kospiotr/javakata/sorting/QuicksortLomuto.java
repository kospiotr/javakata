package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortLomuto {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        log.info("Sorting A={} L={} R={}", subArray(array, left, right), left, right);
        if (left >= right || left < 0) return;

        int pivotIndex = partition(array, left, right);
        log.info("Partition result A={} P={} PI={} L={} R={}", array, array[pivotIndex], pivotIndex, left, right);
        quicksort(array, left, pivotIndex - 1);
        quicksort(array, pivotIndex + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = (left - 1);
        log.info("Partition: L={} R={} P={} PI={}", left, right, pivot, right);

        for (int j = left; j < right; j++) {
            log.info("A={}", arrayPointers(array, i, j));
            if (array[j] <= pivot) {
                i++;
                log.info("A={}", arrayPointers(array, i, j));
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }


}
