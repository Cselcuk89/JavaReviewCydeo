package org.Selcuk.streamTasks;

import org.Selcuk.Dish;
import org.Selcuk.DishData;
import org.Selcuk.Type;

import java.util.*;
import java.util.stream.Collector;
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
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //counting(): returns a collector that counts the number of the elements
        System.out.println("*************************");
        Long evenCount = numbers.stream().filter(x -> x%2==0)
                                .collect(Collectors.counting());
        System.out.println(evenCount);
        // summingInt(): returns a collector that produces them of integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averaginInt(): returns a collector that produces an average of integer values
        System.out.println("*************************");
        Double caloriesAverage = DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(caloriesAverage);
        //joining(): is used to join various elements of a character or string array into a single string object.
        System.out.println("*************************");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream().collect(Collectors.joining(","));
        System.out.println(courses);
        //partitioningBy() : is used to partition a stream of objects based on a given predicate.
        System.out.println("*************************");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream().
                                             collect(Collectors.partitioningBy(Dish::isVegeterian));
        System.out.println(veggieDish);
        //groupingBy(): is used to group objects by some property and store results in a map instance
        System.out.println("*************************");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);







    }
}
