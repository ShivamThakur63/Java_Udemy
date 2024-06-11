package Concepts.Java08.DateTime;

import java.time.LocalTime;

// LocalTime : Represents a Time without a date or TimeZones 
public class ForLocalTime 
{
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customTime = LocalTime.of(14, 30 );
        System.out.println(customTime);
        String timeInString = "15:30:45";
        LocalTime StringInTime = LocalTime.parse(timeInString);
        System.out.println(StringInTime);

        LocalTime BeforeOneHour = now.minusHours(1);
        System.out.println("Current Time    : " + now);
        System.out.println("Before One Hour : " + BeforeOneHour);

        if(now.isAfter(BeforeOneHour))
        {
            System.out.println("--".repeat(8));
            System.out.println("Hann Bhai.. !!");
            System.out.println("--".repeat(8));
        }else
        {
            System.out.println("--".repeat(8));
            System.out.println("Nahi Bhai.. !!");
            System.out.println("--".repeat(8));
        }

         
        
    }
    
}
