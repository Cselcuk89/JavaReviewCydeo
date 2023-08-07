package org.Selcuk;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //create a set
        Set<Student> mySet = new HashSet<>();
        // add element
        mySet.add(new Student(7,"Ibadet"));
        mySet.add(new Student(8,"Ahmet"));
        mySet.add(new Student(9,"Muhabbet"));
        mySet.add(new Student(9,"Muhabbet"));
        System.out.println(mySet);
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));
        System.out.println("first repeating character is : " + firstRepeatingChar("java developer"));

    }
    //java method for detecting first repeating character
    public static Character firstRepeatingChar(String str){
        //create a hashset
        Set<Character> chars = new HashSet<>();
        //iteration return ch if add returns false
        for (Character ch : str.toCharArray()){
            if (!chars.add(ch))
                return ch;
        }
        return null;

    }
}

