package com.t0lia.collectionExercises.homework.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishSolverTest {

    @ParameterizedTest
    @MethodSource("data")
    void test(String intput, int expectedResult) {
        ReversePolishSolver solver = new ReversePolishSolver();
        assertEquals(expectedResult, solver.eval(intput));

    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("3 4 +", 7),
                Arguments.of("3 4 -", -1),
                Arguments.of("1 2 + 4 * 3 +", 15),
                Arguments.of("3 5 6 + *", 33),
                Arguments.of("4 5 3 6 2 + + * +", 59),
                Arguments.of("4 5 3 5 2 + + * + 2 /", 27),
                Arguments.of("1 2 3 12 3 6 1 2 + / + * - + +", -54)
        );
    }
}