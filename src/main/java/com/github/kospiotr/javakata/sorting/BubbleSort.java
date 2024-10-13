package com.github.kospiotr.javakata.sorting;


import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.logging.ArrayLogging.printArray;

@Slf4j
public class BubbleSort {


    public static void sort(int[] array) {
        log.debug("Sorting A={}", array);
        int iterations = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                iterations++;
                log.debug("A={}", printArray(array, j, j + 1));
                if (array[j] > array[j + 1]) {
                    log.debug("Swap A[{}] = {} <=> A[{}] = {}", j, array[j], j + 1, array[j + 1]);
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
        log.info("Iterations: {}", iterations);
    }

}
