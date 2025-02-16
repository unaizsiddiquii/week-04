package com.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksWebPage {

    //method to find links int the webpage
    public static void extractLinksWebPage(String text) {

        //patter finder regex
        String regex = "\\bhttps?:\\/\\/[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //displaying the links
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }

    }

    public static void main(String[] args) {

        //demo text
        String text = "Visit https://www.google.com and http://example.org for more info.";

        extractLinksWebPage(text);
    }
}
