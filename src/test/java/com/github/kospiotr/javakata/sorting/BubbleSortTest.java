package com.github.kospiotr.javakata.sorting;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class BubbleSortTest implements SortTestValues {

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void test(int[] input, int[] expected, String name) {
        BubbleSort.sort(input);
        assertThat(input).containsExactly(expected);
    }
}