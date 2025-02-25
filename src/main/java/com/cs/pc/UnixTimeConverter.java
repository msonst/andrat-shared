package com.cs.pc;


import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UnixTimeConverter  implements Serializable{

    public static String convertUnixTimeToDate(long unixTimeMillis) {
        // Convert Unix time in milliseconds to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(unixTimeMillis), ZoneId.systemDefault());

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        // Format the date
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        long unixTimeMillis = 1638316800000L; // Example Unix time in milliseconds
        String formattedDate = convertUnixTimeToDate(unixTimeMillis);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
