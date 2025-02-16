package com.validateahexcolorcode;

import java.util.regex.Pattern;

public class ValidHexCodeChecker {

    public static void validateHexCode(String hexCode) {
        String regex = "^#([A-Fa-f0-9]{6})$";

        if (Pattern.matches(regex, hexCode)) {
            System.out.println(hexCode + " - Valid Hex Code");
        } else {
            System.out.println(hexCode + " - Invalid Hex Code");
        }
    }

    public static void main(String[] args) {
        String haxCode = "#FFA123";
        validateHexCode(haxCode);
    }
}
