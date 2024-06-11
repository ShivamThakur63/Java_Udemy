package Concepts.Java08.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

// ZonedDateTime :  Represents a date and time with a time zone .

// UTC - Universal Time Co-ordinated 
// 24 Zones 

public class ForZonedDateTime 
{
    public static void main(String[] args) 
    {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);   

        Set<String> availableZoneIDs = ZoneId.getAvailableZoneIds();
        availableZoneIDs.forEach(System.out::println);

        ZonedDateTime torontoTime = ZonedDateTime.of(2000, 12, 10, 14,30,30, 30, ZoneId.of("America/Toronto"));
        System.out.println("Nepali Time    : "+now);
        System.out.println("Toronto Time   : " + torontoTime);

        ZonedDateTime argentina = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println("Argentina Time : "+ argentina );

        // Get Zones 
        ZonedDateTime parsedDate = ZonedDateTime.parse("2000-12-10T14:30:30.000000030-05:00[America/Toronto]");
        System.out.println(parsedDate.getZone());
        
    }    
}
