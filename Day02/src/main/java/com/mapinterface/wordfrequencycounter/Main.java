package com.mapinterface.wordfrequencycounter;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        System.out.println("Orignal: " + text);
        System.out.println("Result: " + WordFrequencyCounter.wordFrequencyCounter(text));
    }
}
