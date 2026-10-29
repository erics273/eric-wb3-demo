package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeStuff {

    public static void main(String[] args) {

        DateTimeFormatter formatterWithTime = DateTimeFormatter.ofPattern("h:mm:ss");
        DateTimeFormatter formatterWithoutTime = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter formatterWithDateAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        DateTimeFormatter crazyFormat = DateTimeFormatter.ofPattern("E, MMM dd, yyyy h:mm:ss");

        //get the date right now
        LocalDate dateRightNow = LocalDate.now();
        System.out.println(dateRightNow.format(formatterWithoutTime));

        LocalTime timeRightNow = LocalTime.now();
        System.out.println(timeRightNow.format(formatterWithTime));

        //gets the current date and time
        LocalDateTime dateTimeNow = LocalDateTime.now();

        //display the current date and time
        System.out.println(dateTimeNow.format(formatterWithDateAndTime));
        System.out.println(dateTimeNow.format(crazyFormat));

        //working with the date
        System.out.println("Day of week: " + dateTimeNow.getDayOfWeek());
        System.out.println("Day of Month: " + dateTimeNow.getDayOfMonth());
        System.out.println("Day of Year: " + dateTimeNow.getDayOfYear());

        System.out.println();
        //working with the time
        System.out.println("Hour of Day: " + dateTimeNow.getHour());
        System.out.println("Minute of Day: " + dateTimeNow.getMinute());
        System.out.println("Second of Day: " + dateTimeNow.getSecond());

        //easy to parse a date in the standard iso 8601 format
        LocalDate jenniferGaveMeThisDate = LocalDate.parse("2008-10-26");
        System.out.println("Day of week: " + jenniferGaveMeThisDate.getDayOfWeek());
        System.out.println("Day of Month: " + jenniferGaveMeThisDate.getDayOfMonth());
        System.out.println("Day of Year: " + jenniferGaveMeThisDate.getDayOfYear());

        DateTimeFormatter normalDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //cant parse this thing because its not in the standard format
        LocalDate elmanGaveMeThisDate = LocalDate.parse("11/21/2000", normalDate);
        System.out.println("Day of week: " + elmanGaveMeThisDate.getDayOfWeek());
        System.out.println("Day of Month: " + elmanGaveMeThisDate.getDayOfMonth());
        System.out.println("Day of Year: " + elmanGaveMeThisDate.getDayOfYear());




    }

}
