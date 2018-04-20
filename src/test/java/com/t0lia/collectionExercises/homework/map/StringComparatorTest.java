package com.t0lia.collectionExercises.homework.map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringComparatorTest {

    @ParameterizedTest
    @MethodSource("data")
    void test(String fst, String snd, boolean expectedResult) {
        StringComparator comparator = new StringComparator();
        assertEquals(expectedResult, comparator.isEquals(fst, snd));

    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("aab", "aab", true),
                Arguments.of("", "", true),
                Arguments.of("kdsjfnkjdsnjkveroinej9483ujo4094ujf3o4u8", "uo43fjjn9edknf8u0ejv8dous4rij3kjns4jko49", true),
                Arguments.of("kdsjfnkjdsnjkveroinej9483ujo4094ujf3o4u8", "uo43fjjn9edknf8u0ejv8dous4rij3kjns4jk049", false),
                Arguments.of("&j043jLl453-K543-+js;@1!9J~", "15!jj43JL~3jl4s345-9+K-;@&0", true),
                Arguments.of("&j043jLl453-K543-+js;@1!9j~", "15!jj43JL~3jl4s345-9+K-;@&0", false),
                Arguments.of("abb", "aab", false),
                Arguments.of("aab", "aa", false),
                Arguments.of("abb", null, false),
                Arguments.of(null, "aab", false)
        );
    }
}