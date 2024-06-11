package Concepts.Java08.DateTime;

import java.time.Instant;

public class ForInstant {
    
    public static void main(String[] args) {
        
        long timeMillis = System.currentTimeMillis();   // will return time in millisecond since utc 1st Jan 1970\
            // will be converted from timeStamp to Current Time from onlie converter to view current dateTime

        Instant now = Instant.now();    // do the same thing but with nano second 

        System.out.println("MilliSecond  : " + timeMillis);
        System.out.println("NanoSecond   : " + now);

        // ZonedDateTime atZone = now.atZone(ZoneId.of("Australia/Melbourne"));
        // System.out.println(atZone);
        now.plusSeconds(788977982);

        System.out.println(now);
        System.out.println(Instant.now());

        if(now.isAfter(Instant.now()))
        {
            System.out.println("Hann Bhai...");
        }else{
            System.out.println("Nahi Bhai...");
        }
    }
}
