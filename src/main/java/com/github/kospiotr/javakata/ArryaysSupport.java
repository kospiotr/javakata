package com.github.kospiotr.javakata;

import lombok.extern.slf4j.Slf4j;

import static com.github.kospiotr.javakata.logging.ArrayLogging.arrayPointers;

@Slf4j
public class ArryaysSupport {
    public static void swap(int[] array, int left, int right) {
        log.info("Swap A[{}] = {} <=> A[{}] = {}", left, array[left], right, array[right]);
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
        log.info("A={}", arrayPointers(array, left, right));
    }
}
