package org.Selcuk;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<AppleClass> inventory = new ArrayList<AppleClass>();
        inventory.add(new AppleClass(300,Color.GREEN));
        inventory.add(new AppleClass(100,Color.RED));
        inventory.add(new AppleClass(20,Color.GREEN));
        inventory.add(new AppleClass(50,Color.RED));

        List<AppleClass> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<AppleClass> appleColor = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(appleColor);
        List<AppleClass> applesWeight = prettyPrint(inventory,new AppleGreenColorPredicate());
        System.out.println(applesWeight);
        List<AppleClass> applesColorAndWeight = prettyPrint(inventory,new AppleHeavyPredicate());
        System.out.println(applesColorAndWeight);


    }

    private static List<AppleClass> filterApples(List<AppleClass> inventory, ApplePredicate applePredicate) {
        List<AppleClass> result = new ArrayList<>();
        for (AppleClass appleClass : inventory){
            if (applePredicate.test(appleClass)){
                result.add(appleClass);
            }
        }
        return result;
    }
    private static List<AppleClass> prettyPrint(List<AppleClass> apples,
                                           ApplePredicate applePredicate) {

        List<AppleClass> resultList = new ArrayList<>();
        for (AppleClass apple : apples) {
            String output = applePredicate.print(apple);
            System.out.println(output);
        }

        return resultList;
    }
}
