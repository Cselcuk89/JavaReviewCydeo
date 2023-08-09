package org.Selcuk.functinalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(55).build());
        users.add(User.builder().firstName("Amy").lastName("Evans").age(15).build());
        users.add(User.builder().firstName("Emma").lastName("Pellard").age(25).build());
        //print all elements in the list
        printName(users,predicate -> true);// we put true to print everything in the users list



        //Print all users whose last name starts with E
        printName(users,user -> user.getLastName().startsWith("E"));

    }
    private static void printName(List<User> users,Predicate<User> predicate){
        for (User user : users){
            if (predicate.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
