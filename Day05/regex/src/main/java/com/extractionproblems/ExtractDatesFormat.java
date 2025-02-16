package com.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDatesFormat {

    public static void extractDatesFormat(String text) {

        String regex = "\\b(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }


    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extractDatesFormat(text);
    }
}
