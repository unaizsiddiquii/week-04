package com.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

    //method to extract capitalized words
    public static void extractCapitalizedWords(String text) {

        //regex pattern to extract capital words
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //displaying the capitalized words in the text
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }

    }

    public static void main(String[] args) {

        //demo text
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        //method call
        extractCapitalizedWords(text);

    }
}
