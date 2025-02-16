package com.replaceandmodifystring;

public class ReplaceMultipleSpaces {

    //method to replace spaces
    public static void replaceMultipleSpaces(String text) {

        String regex = " {2,}";
        //replacing the multiple spaces with a space
        String result = text.replaceAll(regex, " ");

        //display the result
        System.out.println("Before: [" + text + "]");
        System.out.println("After: [" + result + "]");
    }


    public static void main(String[] args) {

        String text = "This  is  an  example    with multiple    spaces.";
        replaceMultipleSpaces(text);

    }
}
