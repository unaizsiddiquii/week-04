package com.checkedexception;

public class Main {
    public static void main(String[] args) {

        //filePath to store the path of the file
        String filePath = "C:\\Users\\unaiz\\OneDrive\\Desktop\\CAPGEMINI\\week-04\\Day04\\src\\main\\java\\com\\checkedexception\\data.txt";

        //object of fileHandler class
        FileHandler fileHandler = new FileHandler(filePath);

        //method to print the content
        fileHandler.readFile();
    }
}