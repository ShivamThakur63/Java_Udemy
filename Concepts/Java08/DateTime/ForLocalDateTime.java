package Concepts.Java08.DateTime;

import java.time.LocalDateTime;

// LocalDateTime : Represents a date and time without a timezone.
public class ForLocalDateTime {
    
    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime customDate = LocalDateTime.of(2014, 10, 10, 10, 30, 50);
        System.out.println(customDate);

        LocalDateTime myDate = LocalDateTime.parse("2023-01-11T13:48");
        System.out.println(myDate);

        // All the other methods of LocalTime & LocalDate are also applicable to this 
        /*
         * Like 
         * - minus
         * - isAfter
         * - isBefore
         * - parse
         */
    }


}
