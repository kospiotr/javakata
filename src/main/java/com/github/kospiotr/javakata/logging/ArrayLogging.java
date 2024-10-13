package com.github.kospiotr.javakata.logging;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class ArrayLogging {
    public static String printArray(int[] array, int lo, int hi) {
        String out = "{";
        for (int i = 0; i < array.length; i++) {
            if (i == lo) out += "L[";
            if (i == hi) out += "H[";
            out += array[i];
            if (i == lo) out += "]";
            if (i == hi) out += "]";
            if (i < array.length - 1) out += ", ";
        }
        out += "}";
        return out;
    }

    public static int[] subArray(int[] array, int lo, int hi) {
        return Arrays.copyOfRange(array, lo, hi + 1);
    }
}
