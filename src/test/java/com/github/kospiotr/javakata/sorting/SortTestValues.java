package com.github.kospiotr.javakata.sorting;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

public interface SortTestValues {
    int[] expected10Sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    static Stream<Arguments> values() {
        return Stream.of(
                of(new int[]{}, new int[]{}, "Empty"),
                of(new int[]{1}, new int[]{1}, "One Element"),
                of(new int[]{1, 2}, new int[]{1, 2}, "Two sorted"),
                of(new int[]{2, 1}, new int[]{1, 2}, "Two reverse sorted"),
                of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, expected10Sorted, "Ordered"),
                of(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, expected10Sorted, "Reverse Ordered"),
                of(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9}, expected10Sorted, "Sorted Mixed Ordered"),
                of(new int[]{1, 2, 6, 7, 5, 3, 4, 8, 9}, expected10Sorted, "Pair Ordered"),
                of(new int[]{9, 8, 4, 3, 5, 7, 6, 2, 1}, expected10Sorted, "Pair Reverse Ordered")
        );
    }
}
