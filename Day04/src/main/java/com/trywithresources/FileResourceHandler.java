package com.trywithresources;

import java.io.*;

public class FileResourceHandler {

    //method to handle file resource
    public static void fileResourceHandler(String fileName) {

        //to handle the exception
        try {
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
