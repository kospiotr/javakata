package com.github.kospiotr.javakata.sorting;


import com.github.kospiotr.javakata.logging.ArrayLogging;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Quicksort {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        int[] subArray = Arrays.copyOfRange(array, left, right + 1);
        log.info("Sorting A={}", subArray);
        if (left < right) {
            int index = partition(array, left, right);
            log.info("Partition result A={}, I={}", array, index);
            quicksort(array, left, index - 1);
            quicksort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int middle = (left + right) / 2;
        int pivot = array[middle];
        log.info("Partition: L={}, R={}, M={}, P={}", left, right, middle, pivot);
        while (left <= right) {
            log.info("A={}", ArrayLogging.arrayPointers(array, left, right));
            while (array[left] < pivot) {
                log.info("L++");
                left++;
                log.info("A={}", ArrayLogging.arrayPointers(array, left, right));
            }
            while (array[right] > pivot) {
                log.info("R--");
                right--;
                log.info("A={}", ArrayLogging.arrayPointers(array, left, right));
            }
            if (left <= right) {
                log.info("Swap A[{}] = {} <=> A[{}] = {}", left, array[left], right, array[right]);
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
                log.info("L++");
                log.info("R--");
            }
        }
        return left;
    }

}
