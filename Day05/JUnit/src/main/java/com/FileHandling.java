package com;

import java.io.*;
import java.sql.SQLOutput;

public class FileHandling {

    public static void writeToFile(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello World");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try {

            File file = new File(fileName);

            if (file.exists()) {

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File not found");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\unaiz\\OneDrive\\Desktop\\repo\\week-04\\Day05\\JUnit\\src\\main\\java\\com\\info.txt";
        writeToFile(fileName);
        readFromFile(fileName);
    }
}
