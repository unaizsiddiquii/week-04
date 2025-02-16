package com.finallyblock;

public class DivisionCalculator {

    public static void division(int num, int num2) {

        //for handling the exception
        try {
            int result = num / num2;
            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {
            System.out.println("Denominator is zero : " + e.getMessage());
        } finally {
            System.out.println("Operation completed");
        }
    }
}
