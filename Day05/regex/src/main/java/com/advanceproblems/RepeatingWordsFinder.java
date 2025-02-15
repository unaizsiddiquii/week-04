package com.advanceproblems;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordsFinder {

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            // Capture repeated word
            repeatingWords.add(matcher.group(1));
        }

        System.out.println(String.join(", ", repeatingWords));
    }
}
