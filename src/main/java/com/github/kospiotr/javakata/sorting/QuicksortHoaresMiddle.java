package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortHoaresMiddle {

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

    private static int partition(int[] array, int lo, int high) {
        int pivotIndex = high;
        int pivot = array[pivotIndex];
        log.info("Partition: L={} R={} P={} PI={}", lo, high, pivot, pivotIndex);
        while (lo <= high) {
            while (array[lo] < pivot) {
                log.info("L++");
                lo++;
                log.info("A={}", arrayPointers(array, lo, high));
            }
            while (array[high] > pivot) {
                log.info("H--");
                high--;
                log.info("A={}", arrayPointers(array, lo, high));
            }
            if (lo <= high) {
                swap(array, lo, high);
                if (pivotIndex == lo) {
                    pivotIndex = high;
                }
                if (pivotIndex == high) {
                    pivotIndex = lo;
                }
                lo++;
                high--;
                log.info("L++");
                log.info("H--");
                log.info("A={}", arrayPointers(array, lo, high));
            }
        }
        return pivotIndex;
    }


}
