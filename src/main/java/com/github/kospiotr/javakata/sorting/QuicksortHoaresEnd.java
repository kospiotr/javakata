package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.printArray;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortHoaresEnd {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int hi, int lo) {
        log.info("Sorting A={} L={} R={}", subArray(array, hi, lo), hi, lo);
        if (hi >= lo || hi < 0) return;

        int pi = partition(array, hi, lo);
        log.info("Partition result A={} P={} PI={} L={} R={}", array, array[pi], pi, hi, lo);
        quicksort(array, hi, pi - 1);
        quicksort(array, pi + 1, lo);
    }

    private static int partition(int[] array, int lo, int hi) {
        int pi = hi;
        int pivot = array[pi];
        log.info("Partition: L={} R={} P={} PI={}", lo, hi, pivot, pi);
        while (true) {
            while (array[lo] < pivot) {
                lo++;
                log.debug(printArray(array, lo, hi));
            }
            while (array[hi] > pivot) {
                hi--;
                log.debug(printArray(array, lo, hi));
            }
            if (lo >= hi) {
                return lo;
            }
            swap(array, lo, hi);
            log.debug(printArray(array, lo, hi));
        }
    }


}
