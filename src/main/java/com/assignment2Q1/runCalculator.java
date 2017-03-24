package com.assignment2Q1;

/**
 * Created by Ernst on 2017/03/24.
 */
public class runCalculator {

    public static void main(String[]args)
    {
        Calculator cal = new Calculator();

        System.out.println("Addition Integer: " + cal.iAdd(4,2));
        System.out.println("Addition Float: " + cal.fAdd(4.25,2.25));
        System.out.println("Multiplication: " + cal.iMultiply(4,2));
        System.out.println("Bigger than: " + cal.iBiggerThan(4,2));
        System.out.println("Smaller than: " + cal.iSmallerThan(4,2));
        System.out.println("Division: " + cal.fDivide(4.25,2.25));

    }
}
