package com.t0lia.collectionExercises.iterator;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("fst");
        set.add("fst");
        set.add("snd");
        System.out.println(set);
    }
}
