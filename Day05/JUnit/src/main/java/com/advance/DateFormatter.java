package com.advance;

public class DateFormatter {
    public static String formatDate(String inputDate) {
        // Splitting the input date string by "-"
        String[] parts = inputDate.split("-");

        // Rearranging the parts to "dd-MM-yyyy"
        if (parts.length == 3) {
            return parts[2] + "-" + parts[1] + "-" + parts[0];
        } else {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd");
        }
    }
}
