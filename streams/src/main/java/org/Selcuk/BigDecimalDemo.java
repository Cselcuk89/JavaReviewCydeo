package org.Selcuk;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("174.56");
        BigDecimal b2 = new BigDecimal("174.26");
        System.out.println(b1.subtract(b2));
        //scaling and rounding
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1,RoundingMode.CEILING));
        System.out.println(number1.setScale(1,RoundingMode.FLOOR));

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal(2)));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal(3)));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal(1)));
        //bigDecimals are immutable
    }
}
