package com.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {

    public static boolean PasswordValidator(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        return password.matches(regex);
    }
}
