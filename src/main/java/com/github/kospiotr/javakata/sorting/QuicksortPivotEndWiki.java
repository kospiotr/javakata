package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortPivotEndWiki {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lo, int hi) {
        log.info("Sorting A={} L={} R={}", subArray(array, lo, hi), lo, hi);
        if (lo >= hi || lo < 0) {
            return;
        }
        int pivotIndex = partition(array, lo, hi);
        log.info("Partition result A={} P={} PI={} L={} R={}", array, array[pivotIndex], pivotIndex, lo, hi);
        quicksort(array, lo, pivotIndex - 1);
        quicksort(array, pivotIndex + 1, hi);
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int i = lo;
        log.info("Partition: L={} R={} P={} PI={}", lo, hi, pivot, hi);

        for (int j = lo + 1; j < hi - 1; j++) {
            log.info("A={}", arrayPointers(array, i, j));
            if (array[j] <= pivot) {
                swap(array, i, j);
                i++;
                log.info("A={}", arrayPointers(array, i, j));
            }
        }
        swap(array, i, hi);
        return i;
    }


}
