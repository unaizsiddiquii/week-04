package com.checkedexception;

import java.io.*;

public class FileHandler {
    private String fileName;

    //constructor
    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    //method to print content of the file and demonstrate the try catch block
    public void readFile() {
        try {

            //file object to get source of the file
            File file = new File(this.fileName);

            //check existence of the file
            if (file.exists()) {

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;

                //print the content of file
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File not found");
            }

            //catch block to handle the exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. " + e.getMessage());
        }
    }
}
