package com.advanceproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {

    public static void currencyValues(String text) {
        //pattern for extracting currency values
        String regex = "\\$?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        //displaying the currency values
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }

    }

    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        currencyValues(text);
    }
}
