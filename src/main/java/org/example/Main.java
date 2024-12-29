package org.example;

import org.example.arrays.MyArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.example.collections.MyCollections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3, 4, 5 ,6, 7, 9, 10};
        System.out.println("Ищем 3 в массиве: " + MyArrays.binarySearch(arr, 3));

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12);
        System.out.println("Ищем 8 в списке: " + MyCollections.binarySearch(numbers, 8, Integer::compare));


        List<Person> people = Arrays.asList(
                new Person("Ahasa", 20),
                new Person("Sasha", 25),
                new Person("Hello there", 30)
        );

        Comparator<Person> byAge = Comparator.comparingInt(p -> p.age);
        System.out.println("Ищем возраст 25: " +
                MyCollections.binarySearch(people, new Person("", 25), byAge));
    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}