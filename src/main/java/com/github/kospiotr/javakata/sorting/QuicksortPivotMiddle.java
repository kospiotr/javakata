package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.ArryaysSupport.swap;
import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;
import static com.github.kospiotr.javakata.logging.ArrayLogging.subArray;

@Slf4j
public class QuicksortPivotMiddle {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        log.info("Sorting A={} L={} R={}", subArray(array, left, right), left, right);
        if (left < right) {
            int index = partition(array, left, right);
            log.info("Partition result A={} P={} PI={} L={} R={}", array, array[index], index, left, right);
            quicksort(array, left, index - 1);
            quicksort(array, index + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivotIndex = right;
        int pivot = array[pivotIndex];
        right--;
        log.info("Partition: L={} R={} P={} PI={}", left, right, pivot, pivotIndex);
        while (left <= right) {
            while (array[left] < pivot) {
                log.info("L++");
                left++;
                log.info("A={}", arrayPointers(array, left, right));
            }
            while (array[right] > pivot) {
                log.info("R--");
                right--;
                log.info("A={}", arrayPointers(array, left, right));
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
                log.info("L++");
                log.info("R--");
                log.info("A={}", arrayPointers(array, left, right));
            }
        }
        swap(array, left, pivotIndex);
        return left;
    }



}
