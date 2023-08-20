package org.Selcuk.doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        //reference to a static method using lambda
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        //using double colon operator
        Calculate s2 =Calculator::findSum;
        s2.calculate(100,45);

        //reference to instance method using lambda
        Calculate m1 = (x,y) -> new Calculator().findMultiplication(x,y);
        m1.calculate(24,4);

        //using double colon for instance method
        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiplication;
        m2.calculate(25,10);
        //or
        Calculate m3 = new Calculator()::findMultiplication;
        m3.calculate(25,5);

        //using BiFunction interface with both lambda and double colon operator
        //with lambda
        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));
        //with double colon operator
        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));
        //using consumer interface with both lambda and double colon operator
        //with lambda
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);
        //with double colon operator
        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;




    }
}
