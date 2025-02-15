package com.advanceproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNames {
    public static void programmingLanguageNames(String text) {
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|C|Ruby|Swift|Kotlin|PHP|R|TypeScript|Rust|Perl)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        programmingLanguageNames(text);

    }
}
