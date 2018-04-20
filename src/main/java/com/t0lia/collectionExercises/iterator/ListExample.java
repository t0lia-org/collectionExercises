package com.t0lia.collectionExercises.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("fst");
        list.add("snd");
        list.add("snd");

        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("------");
        System.out.println(list.indexOf("snd"));
        System.out.println("------");
        System.out.println(list.lastIndexOf("snd"));

        System.out.println("------");
        System.out.println(list.get(0));
        System.out.println("------");
        System.out.println(list.subList(0,2));
    }
}
