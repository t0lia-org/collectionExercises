package com.t0lia.collectionExercises.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class EqualsAndHashCodeExample {
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

        Dog fst = new Dog(12, "Muhtar");
        Dog snd = new Dog(12, "Muhtar");
        System.out.println(fst.equals(snd));
        System.out.println(fst==snd);
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(fst);
        System.out.println(dogs);
        dogs.remove(snd);
        System.out.println(dogs);

    }
}
