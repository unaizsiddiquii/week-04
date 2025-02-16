package com.throwvsthrows;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //for handling the exception in main class
        try {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter years: ");
            int years = scanner.nextInt();
            double interest = InterestCalculator.calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {

            //execute when argument is negative
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
