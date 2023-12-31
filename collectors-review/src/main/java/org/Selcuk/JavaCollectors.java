package org.Selcuk;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        //toCollection(supplier) ---> is used to create a collection using collector
        System.out.println("*************************");
        List<Integer> numberList = numbers.stream().filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream().filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() ---> returns a Collector interface that gathers the input data into a new list
        System.out.println("*************************");
        List<Integer> numberList2 = numbers.stream().filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);
        //toSet() ---> returns a Collector interface that gathers the input data into a new set
        System.out.println("*************************");
        Set<Integer> numberSet2 = numbers.stream().filter(x -> x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Function) ---> returns a collector interface that gathers the input data into a new map
        System.out.println("*************************");
        Map<String,Integer> dishMap = Dis




    }

}
