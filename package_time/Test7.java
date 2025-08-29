package com.practice.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test7 {
    public static void main(String[] args) {
        String time = "01:30 PM"; // input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
        LocalTime localTime = LocalTime.parse(time, formatter);
        
        // Prints in 24-hour format (default)
        System.out.println(localTime);
        
        // Prints in original 12-hour format
        System.out.println(localTime.format(formatter));
    }
}
