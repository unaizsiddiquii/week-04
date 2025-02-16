package com.multiplecatchblock;

import java.util.Scanner;

public class ArrayOperations {

    public static void arrayOperations() {
        Scanner scanner = new Scanner(System.in);

        // Accept array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Handle null case (if size is 0, make array = null)
        Integer[] array;
        if (size > 0) array = new Integer[size];
        else array = null;

        if (array != null) {
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        }

        // Accept index to retrieve value
        System.out.print("Enter index to retrieve value: ");
        int index = scanner.nextInt();

        //exception handling with multiple catch block
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }

    }

    public static void main(String[] args) {

        //method to perform array operation
        arrayOperations();

    }
}
