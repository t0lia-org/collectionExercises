package com.t0lia.collectionExercises.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fst");
        list.add("snd");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("------------");
        for (Iterator<String> iterator2 = list.iterator(); iterator2.hasNext(); ) {
            String value = iterator2.next();
            System.out.println(value);
        }

        System.out.println("------------");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
