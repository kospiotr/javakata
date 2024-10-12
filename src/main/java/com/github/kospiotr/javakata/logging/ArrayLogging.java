package com.github.kospiotr.javakata.logging;

public class ArrayLogging {
    public static String arrayPointers(int[] array, int left, int right) {
        String out = "{";
        for (int i = 0; i < array.length; i++) {
            if (i == left) out += "L[";
            if (i == right) out += "R[";
            out += array[i];
            if (i == left) out += "]";
            if (i == right) out += "]";
            if (i < array.length - 1) out += ", ";
        }
        out += "}";
        return out;
    }
}
