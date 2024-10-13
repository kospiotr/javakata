package com.github.kospiotr.javakata.sorting;


import com.github.kospiotr.javakata.ArryaysSupport;
import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.logging.ArrayLogging.printArray;

@Slf4j
public class SelectionSort {


    public static void sort(int[] array) {
        log.info("Sorting A={}", array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                log.info("A={}", printArray(array, i, j));
                if (array[i] > array[j]) {
                    log.info("Swap A[{}] = {} <=> A[{}] = {}", i, array[i], j, array[j]);
                    ArryaysSupport.swap(array, i, j);
                }
            }
        }
    }

}
