package org.Selcuk.lambdaTask;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(150).color(Color.RED).build());
        inventory.add(Orange.builder().weight(230).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(165).color(Color.RED).build());
        inventory.add(Orange.builder().weight(450).color(Color.RED).build());
        inventory.add(Orange.builder().weight(175).color(Color.RED).build());
        inventory.add(Orange.builder().weight(350).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(150).color(Color.RED).build());
        OrangeFormatter simpleFormatter = orange -> "An orange " + orange.getWeight() + "gr.";// i removed parenthesis and Object type because of type inference and single statement.
        prettyprintOrange(inventory,simpleFormatter);

        prettyprintOrange(inventory,orange -> "A " + orange.getColor() + " orange is " + orange.getWeight() + " gr." );// you can pass the action directly into the method.
        System.out.println("*******************************************");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        prettyprintOrange(inventory,fancyFormatter);






    }
    private static void prettyprintOrange(List<Orange> inventory,OrangeFormatter orangeFormatter){
        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
