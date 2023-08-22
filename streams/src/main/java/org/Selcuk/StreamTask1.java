package org.Selcuk;

import java.util.Arrays;
import java.util.List;

public class StreamTask1 {
    //Given a list of words, prints the number of characters for each word
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                //with lambda
                //.map(w -> w.length())
                //with method reference
                .map(String::length)
                .forEach(System.out::println);

    }
}
