package com.validatelicenseplatenumber;

import java.util.regex.Pattern;

public class ValidLicencePlateNumberChecker {

    //method to check the valid licence plate number
    public static void validLicencePlateChecker(String licencePlateNumber) {

        //regex pattern
        String regex = "^[A-Z]{2}\\d{4}$";

        //check the valid plate number
        boolean isValid = Pattern.matches(regex, licencePlateNumber);

        //displaying the result
        if (isValid) {
            System.out.println(licencePlateNumber + " is valid");
        } else {
            System.out.println(licencePlateNumber + " is not valid");
        }

    }

    public static void main(String[] args) {
        //demo licence Plate Number
        String licencePlateNumber = "UK0726";

        //method call to check UK0726 is valid or not
        validLicencePlateChecker(licencePlateNumber);

    }
}
