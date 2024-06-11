package Concepts.Java08.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//  Duration : Represents a duration of time between two points in time. 
// Used with short period of time i.e Seconds and not to play with days and month.
public class ForDuration 
{
    
    public static void main(String[] args) throws InterruptedException {
        
        Instant start = Instant.now();

        int sum = 0 ;
        for(int i = 0 ; i< 1000000; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);    // 1 Millisecond
        System.out.println(d1);
        System.out.println(d2);
        int comparedDuration = d1.compareTo(d2);    // Returns Nano Seconds
        // int comparedDuration = d2.compareTo(d1);
        System.out.println(comparedDuration);

        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime b = LocalDateTime.now();
        //  Does not work with LocalDate as it only considers second and LocalDate only has Date values
        Duration between = Duration.between(a, b);
        System.out.println(between);

    }
}
