package com.advanceproblems;

public class ValidateCreditCardNumber {

    public static boolean isVisaCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$");
    }

    public static boolean isMasterCard(String cardNumber) {
        return cardNumber.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4111111111111111", // Visa (Valid)
                "5111111111111111", // MasterCard (Valid)
                "6111111111111111", // Invalid (Doesn't start with 4 or 5)
                "4222222222222",    // Invalid (Not 16 digits)
                "5222222222222222"  // MasterCard (Valid)
        };

        for (String card : testCards) {
            System.out.println(card + " is Visa: " + isVisaCard(card));
            System.out.println(card + " is MasterCard: " + isMasterCard(card));
            System.out.println("-----");
        }
    }
}
