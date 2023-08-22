package org.Selcuk;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,6,2,2,9);
        // iterating over each element of this list with lambda
        myList.forEach(x -> System.out.println(x));
        //// iterating over each element of this list with method reference
        myList.forEach(System.out::println);

        // stream intermediate methods
        //filter()
        System.out.println("Filtering");
        myList.stream()
                .filter(i -> i % 3 == 0)
                .distinct()
                .forEach(System.out::println);
        // limit()
        System.out.println("Limiting");
        myList.stream().
                filter(i -> i%2 == 0)
                .limit(1)
                .forEach(System.out::println);

        //skip()
        System.out.println("skipping");
        myList.stream().
                filter(i -> i%2 == 0)
                .skip(2)
                .forEach(System.out::println);

        //map()
        System.out.println("mapping");
        myList.stream()
                .map(number -> number * 3)
                .filter(i -> i%3 == 0)
                .distinct()
                .forEach(System.out::println);


    }
}
