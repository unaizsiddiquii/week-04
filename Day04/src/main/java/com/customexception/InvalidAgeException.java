package com.customexception;

import java.util.Scanner;

//custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
