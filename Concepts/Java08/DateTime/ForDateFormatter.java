package Concepts.Java08.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*

    DateTimeForattor : Formates and parses Time
    y - year
    M - month of year
    d - day of month
    H - hour of day (0-23)
    h - hour of am/pm (1-12)
    m - minute of hour
    s - second of minute
    S - fraction of second
    a - am/pm marker
    E - day of week
    D - day of year
    F - day of week in month
    w - week of year
    W - week of month
    k - hour of day (1-24)
    K - hour of am/pm (0-11]
    z - time zone name
    Z - time zone offset
 */

public class ForDateFormatter 
{
 
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = localDate.format(Formatter);
        System.out.println("Without Formatting  : " + localDate);
        System.out.println("With Formatting     : "+ format);


        LocalDateTime mydate = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy / MM / dd / -- h : m : s ");
        String myFormattedDate = mydate.format(myFormatter);
        System.out.println(mydate);
        System.out.println(myFormattedDate);

        String format1 = "2024 / 06 / 11";
        // LocalDate date = LocalDate.parse(format1); // Will throw exception as the time stamp is not seperated by semicolon
        DateTimeFormatter ex = DateTimeFormatter.ofPattern("yyyy / MM / dd");
        LocalDate parse = LocalDate.parse(format1, ex);
        System.out.println(parse);

        String dateTimeString = "2023-04-24 10:30:45 NST +05:30";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z XXX");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString,formatter2);
        System.out.println(zonedDateTime);
    }
}
