package com.finallyblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        DivisionCalculator.division(num, num2);
    }
}
