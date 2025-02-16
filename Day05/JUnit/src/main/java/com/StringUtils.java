package com;

public class StringUtils {

    //method to reverse string
    public static String reverse(String str) {

        StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse();
        return reverseString.toString();
    }

    //method to check the string is Palindrome or not
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

    //method to convert String in uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

    }
}
