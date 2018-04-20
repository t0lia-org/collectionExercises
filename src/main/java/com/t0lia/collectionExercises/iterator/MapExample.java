package com.t0lia.collectionExercises.iterator;

import java.util.*;

public class MapExample {
    static class Dog {
        private int size;
        private String name;

        void bark() {
        }

        public Dog(int size, String name) {
            this.size = size;
            this.name = name;
        }

        public int getSize() {
            return size;
        }


        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "size=" + size +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return size == dog.size &&
                    Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(size, name);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("fst", 1);
        map.put("snd", 2);
        map.put("trd", 3);
        System.out.println(map);
        System.out.println(map.get("snd"));
        System.out.println(map.get("sk"));

        System.out.println("------------------");
        NavigableMap<Integer, Dog> dogBySize = new TreeMap<>();
        NavigableMap<String, Dog> dogByName = new TreeMap<>();
        Dog muhtar = new Dog(12, "muhtar");
        Dog tobic = new Dog(3, "tobic");
        Dog businka = new Dog(1, "businka");


        dogBySize.put(tobic.getSize(), tobic);
        dogBySize.put(muhtar.getSize(), muhtar);
        dogBySize.put(businka.getSize(), businka);

        dogByName.put(tobic.getName(), tobic);
        dogByName.put(muhtar.getName(), muhtar);
        dogByName.put(businka.getName(), businka);

        System.out.println(dogByName.tailMap("d"));

        System.out.println(dogBySize.headMap(3));
    }
}
