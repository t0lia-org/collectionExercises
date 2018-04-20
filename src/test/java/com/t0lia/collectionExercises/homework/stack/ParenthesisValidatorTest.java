package com.t0lia.collectionExercises.homework.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisValidatorTest {

    @ParameterizedTest
    @MethodSource("data")
    void test(String input, boolean expectedResult) {
        ParenthesisValidator validator = new ParenthesisValidator();
        assertEquals(expectedResult, validator.validate(input));

    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("[]", true),
                Arguments.of("(((())))", true),
                Arguments.of("((){(())()})", true),
                Arguments.of("(()()()())", true),
                Arguments.of("[(])", false),
                Arguments.of("((((((())", false),
                Arguments.of("()))", false),
                Arguments.of("(()()(()", false)
        );
    }
}