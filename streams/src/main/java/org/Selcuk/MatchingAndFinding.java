package org.Selcuk;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        //all match
        System.out.println("**************************************");
        boolean isHeathy = DishData.getAll().stream()
                          .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHeathy);
        //any match
        System.out.println("**************************************");
        if (DishData.getAll().stream().anyMatch(Dish::isVegeterian))
            System.out.println("The menu is vegetarian-friendly");

        //none match
        System.out.println("**************************************");
        boolean isHealthy2 = DishData.getAll().stream()
                             .noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);
        //find any
        System.out.println("**************************************");
        Optional<Dish> dish = DishData.getAll()
                                        .stream()
                                        .filter(Dish::isVegeterian)
                                        .findAny();
        System.out.println(dish.get());

        //find first
        System.out.println("**************************************");
        Optional<Dish> dish2 = DishData.getAll()
                                        .stream()
                                        .filter(Dish::isVegeterian)
                                        .findFirst();
        System.out.println(dish2.get());
    }
}
