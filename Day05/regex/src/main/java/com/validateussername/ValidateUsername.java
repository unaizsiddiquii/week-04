package com.validateussername;

import java.util.regex.Pattern;

public class ValidateUsername {

    //method to find the valid username example - "user_123" valid username
    public static void validUsername(String username) {

        //pattern to find valid username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        //to check the valid username
        boolean isValid = Pattern.matches(regex, username);

        if (isValid) {
            System.out.println(username + " - is Valid");
        } else {
            System.out.println(username + " - is not Valid");
        }

    }

    public static void main(String[] args) {

        //demo username
        String username = "Unaiz_123";

        //method call to find the username is valid or not
        validUsername(username);
    }
}
