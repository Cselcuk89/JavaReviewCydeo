package org.Selcuk;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {
        //print all dish's name that has less than 400 calories
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("***************************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //print three high caloric dish name(>300)
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        ////Print all dish name that are below 400 calories in descending sorted way
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }


}
