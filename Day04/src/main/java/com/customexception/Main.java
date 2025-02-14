package com.customexception;

import java.util.Scanner;

public class Main {

    //method which throw an exception
    public static void validateAge(int age) throws InvalidAgeException {

        //condition for exception
        if (age < 18) {
            throw (new RuntimeException("Age must be 18 or above"));
        } else {
            System.out.println("Access Granted");
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //try catch block
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            e.getMessage();
        }
    }

}