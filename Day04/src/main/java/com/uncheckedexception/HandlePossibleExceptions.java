package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class HandlePossibleExceptions {

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter another number: ");
            int number2 = scanner.nextInt();
            int divisionResult = number1 / number2;
            System.out.println("Division result is : " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("User enters a non-numeric value");
        }


    }
}
