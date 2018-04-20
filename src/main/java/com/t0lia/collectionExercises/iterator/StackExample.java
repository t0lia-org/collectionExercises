package com.t0lia.collectionExercises.iterator;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("fst");
        stack.push("snd");
        stack.push("trd");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
