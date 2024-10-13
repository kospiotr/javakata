package com.github.kospiotr.javakata.sorting;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class QuicksortTest implements SortTestValues {

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void testHoarseStart(int[] input, int[] expected, String name) {
        QuicksortHoaresStart.sort(input);
        assertThat(input).containsExactly(expected);
    }

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void testHoarseMiddle(int[] input, int[] expected, String name) {
        QuicksortHoaresMiddle.sort(input);
        assertThat(input).containsExactly(expected);
    }

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void testHoarseEnd(int[] input, int[] expected, String name) {
        QuicksortHoaresEnd.sort(input);
        assertThat(input).containsExactly(expected);
    }

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void testHoarseRandom(int[] input, int[] expected, String name) {
        QuicksortHoaresRandom.sort(input);
        assertThat(input).containsExactly(expected);
    }

    @ParameterizedTest(name = "{index} {2}")
    @MethodSource("values")
    void testLomuto(int[] input, int[] expected, String name) {
        QuicksortLomuto.sort(input);
        assertThat(input).containsExactly(expected);
    }
}