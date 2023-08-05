package org.Selcuk;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergio");
        map.put(2,"Moses");
        System.out.println(map.get(2));
        System.out.println(findFirstNonRepeating("Java Developer"));


    }
    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer> map1 = new HashMap<>();
        //for counting the chars
        int count;
        //counting the chars and putting values in the hash map
        for (Character ch : str.toCharArray()){
            if (map1.containsKey(ch)){
                count = map1.get(ch);
                map1.put(ch,count + 1);
            }else map1.put(ch,1);
        }
        //starting from string, check if the char count equals 1
        for (Character ch : str.toCharArray()){
            if (map1.get(ch) == 1)
                return ch;
        }
        return null;
    }
}
