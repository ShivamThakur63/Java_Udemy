package Concepts.Java08.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

// Local Date : Represents a date without Time Zone.(Uses Local Machine Time)
public class ForLocalDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        int dayOfMonth = today.getDayOfMonth();
        Month month = today.getMonth();
        int monthValue = today.getMonthValue();
        int year = today.getYear();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of Month    : " + dayOfMonth);
        System.out.println("Day of Month    : " + dayOfWeek);
        System.out.println("Month in Letter : " + month);
        System.out.println("Month in Number : " + monthValue);
        System.out.println("Current Year    : " + year);



        LocalDate customDate = LocalDate.of(1990, 2, 7);
        System.out.println(customDate);

        LocalDate yesterday = today.minusDays(1);
        if(yesterday.isAfter(today))
        {
            System.out.println("Hann Bhai.. !!");
        }else
        {
            System.out.println("--".repeat(8));
            System.out.println("Nahi Bhai.. !!");
            System.out.println("--".repeat(8));
        }
        System.out.println(yesterday);
        System.out.println(today.minusWeeks(6));
        System.out.println(today.minusMonths(6));

        // Leap Year 

        LocalDate leapTime = LocalDate.of(2024, 2, 29);
        System.out.println(leapTime.isLeapYear());


    }
}