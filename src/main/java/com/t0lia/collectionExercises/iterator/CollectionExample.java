package com.t0lia.collectionExercises.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        String fst1 = "fst";
        collection.add(fst1);
        collection.add("snd");
        collection.addAll(Arrays.asList("trd", "frth"));

        String fst2 = "fst";
        collection.remove(fst2);

        System.out.println("size=" + collection.size());
        System.out.println("isempty=" + collection.isEmpty());
        System.out.println("------------");
        for (String str : collection) {
            System.out.println(str);
        }
    }
}
