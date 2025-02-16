package com.advanceproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validSSNFinder {
    public static void validSSN(String text) {
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group() + ", valid");
        } else {
            System.out.println(matcher.group() + ", invalid");
        }

    }

    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        validSSN(text);

    }
}
