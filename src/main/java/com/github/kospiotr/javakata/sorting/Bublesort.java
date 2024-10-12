package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;

@Slf4j
public class Bublesort {


    public static void sort(int[] array) {
        bubbleSort1(array);
    }

    private static void bubbleSort0(int[] array) {
        log.info("Sorting A={}", array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                log.info("A={}", arrayPointers(array, i, j));
                if (array[i] > array[j]) {
                    log.info("Swap A[{}] = {} <=> A[{}] = {}", i, array[i], j, array[j]);
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void bubbleSort1(int[] array) {
        log.debug("Sorting A={}", array);
        int iterations = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                iterations++;
                log.debug("A={}", arrayPointers(array, j, j + 1));
                if (array[j] > array[j + 1]) {
                    log.debug("Swap A[{}] = {} <=> A[{}] = {}", j, array[j], j + 1, array[j + 1]);
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    changed = true;
                }
            }
            if(!changed){
                break;
            }
        }
        log.info("Iterations: {}", iterations);
    }

    public static void bubbleSortGpt(int[] array) {
        log.info("Sorting A={}", array);
        int n = array.length;
        boolean swapped;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Track if any swapping happened

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                log.info("A={}", arrayPointers(array, j, j + 1));
                // Swap if the current element is greater than the next
                if (array[j] > array[j + 1]) {
                    log.info("Swap A[{}] = {} <=> A[{}] = {}", j, array[j], j + 1, array[j + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;  // Set swapped to true
                }
            }

            // If no swapping happened in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
