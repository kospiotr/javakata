package com.github.kospiotr.javakata.logging;

import java.util.Arrays;

public class ArrayLogging {
    public static String arrayPointers(int[] array, int lo, int hi) {
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
