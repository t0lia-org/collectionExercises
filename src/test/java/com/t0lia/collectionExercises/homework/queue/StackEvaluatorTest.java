package com.t0lia.collectionExercises.homework.queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StackEvaluatorTest {
    @ParameterizedTest
    @MethodSource("data")
    void test(Deque<String> input, String expectedResult) {
        StackEvaluator validator = new StackEvaluator();
        assertEquals(expectedResult, validator.evaluate(input));

    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(Stream.of("6", "5", "4", "3", "2", "1").collect(toCollection(LinkedList::new)), "5"),
                Arguments.of(Stream.of("a", "b", "c", "d", "e", "f", "g").collect(toCollection(LinkedList::new)), "c"),
                Arguments.of(Stream.iterate(100, i -> i + 1).limit(43).map(Object::toString).collect(toCollection(LinkedList::new)), "138")
        );
    }
}