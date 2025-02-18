package com.advance;

public class UserRegistration {


    public static void registerUser(String username, String email, String password) {

        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit");
        }
        System.out.println("User registered successfully: " + username);
    }

}
