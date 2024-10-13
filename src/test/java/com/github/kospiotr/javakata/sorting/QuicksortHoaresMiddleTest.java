package com.github.kospiotr.javakata.sorting;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class QuicksortHoaresMiddleTest {

    @Test
    void testSmallArray() {
        //given
        int[] arr = {3, 1, 2, 4, 5};

        //when
        log.info("Before sort: {}", arr);
        QuicksortHoaresMiddle.sort(arr);
        log.info("After sort: {}", arr);

        //then
        assertThat(arr).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void testPairSortedArray() {
        //given
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        //when
        log.info("Before sort: {}", arr);
        QuicksortHoaresMiddle.sort(arr);
        log.info("After sort: {}", arr);

        //then
        assertThat(arr).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void testSortedArray() {
        //given
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //when
        log.info("Before sort: {}", arr);
        QuicksortHoaresMiddle.sort(arr);
        log.info("After sort: {}", arr);

        //then
        assertThat(arr).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void testReverseSortedArray() {
        //given
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        //when
        log.info("Before sort: {}", arr);
        QuicksortHoaresMiddle.sort(arr);
        log.info("After sort: {}", arr);

        //then
        assertThat(arr).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void test312Array() {
        //given
        int[] arr = {3, 1, 2};

        //when
        log.info("Before sort: {}", arr);
        QuicksortHoaresMiddle.sort(arr);
        log.info("After sort: {}", arr);

        //then
        assertThat(arr).containsExactly(1, 2, 3);
    }
}