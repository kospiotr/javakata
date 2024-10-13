package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.printArray;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortLomuto {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lo, int hi) {
        log.info("Sorting A={} L={} R={}", subArray(array, lo, hi), lo, hi);
        if (lo >= hi || lo < 0) return;

        int pivotIndex = partition(array, lo, hi);
        log.info("Partition result A={} P={} PI={} L={} R={}", array, array[pivotIndex], pivotIndex, lo, hi);
        quicksort(array, lo, pivotIndex - 1);
        quicksort(array, pivotIndex + 1, hi);
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int i = (lo - 1);
        log.info("Partition: L={} R={} P={} PI={}", lo, hi, pivot, hi);

        for (int j = lo; j < hi; j++) {
            log.info("A={}", printArray(array, i, j));
            if (array[j] <= pivot) {
                i++;
                log.info("A={}", printArray(array, i, j));
                swap(array, i, j);
            }
        }
        swap(array, i + 1, hi);
        return i + 1;
    }


}
