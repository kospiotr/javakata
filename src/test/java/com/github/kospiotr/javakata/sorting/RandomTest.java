package com.github.kospiotr.javakata.sorting;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

@Slf4j
public class RandomTest {

    public static Stream<Arguments> values() {
        return Stream.of(
                of(1, 2),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 5),
                of(1, 8),
                of(1, 10),
                of(1, 20),
                of(1, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void random(int lo, int hi) {
        int value = new Random().nextInt(lo, hi + 1);
        log.debug("Generated value: {}", value);
        assertThat(value)
                .isGreaterThanOrEqualTo(lo)
                .isLessThanOrEqualTo(hi);
    }
}
