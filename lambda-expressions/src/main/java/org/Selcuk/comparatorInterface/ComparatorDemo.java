package org.Selcuk.comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //ascending sort
        Collections.sort(list);
        System.out.println(list);

        //descending sort
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //descending sort with lambda
        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o2>o1) ? 1 : 0));

        //ascending sort with lambda and using compareTo() method
        //this time we are not overriding the method
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //descending sort with lambda using compareTo method
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );
        //implementing comparing() method from comparator interface for ascending sort
        //since it is static method we can access it classname with dot operator
        Comparator<Apple> sortApple = comparing((apple) ->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);
        //using comparing() method by importing static method in the same line
        myInventory.sort(comparing((apple) -> apple.getWeight()));

        //using comparing() method with double colon operator
        myInventory.sort(comparing(Apple::getWeight));

        //descending sort for weight of apples
        myInventory.sort(comparing(Apple::getWeight).reversed());
        //descending order by weight and also by color
        myInventory.sort(comparing(Apple::getWeight)
                                    .reversed()
                                    .thenComparing(Apple::getColor));
        System.out.println(myInventory);



    }
}
