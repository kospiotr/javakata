package com.github.kospiotr.javakata.sorting;


import com.github.kospiotr.javakata.ArryaysSupport;
import com.github.kospiotr.javakata.logging.ArrayLogging;
import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortHoaresEnd {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lo, int hi) {
        if (lo >= hi || hi < 0) return;
        int partitionIndex = partition(array, lo, hi);
        quicksort(array, lo, partitionIndex - 1);
        quicksort(array, partitionIndex + 1, hi);
    }

    private static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        while (true) {
            while (array[lo] < pivot) lo++;
            while (array[hi] > pivot) hi--;
            if (lo >= hi) return lo;
            swap(array, lo, hi);
        }
    }
}
