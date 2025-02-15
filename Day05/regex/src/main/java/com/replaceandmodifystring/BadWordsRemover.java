package com.replaceandmodifystring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWordsRemover {
    public static void removeBadWords(String text) {


        // List of bad words
        String[] badWords = {"damn", "stupid"};

        // Create a regex pattern to match bad words
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Replace bad words with ****
        String censoredText = matcher.replaceAll("****");

        System.out.println("Before: " + text);
        System.out.println("After: " + censoredText);
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        removeBadWords(text);

    }
}
