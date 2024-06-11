package Concepts.Java08.DateTime;

import java.time.LocalDate;
import java.time.Period;

/*
 * Period is used to find  some big time differnce in terms of days and months  
 */
public class ForPeriod 
{
    public static void main(String[] args) {
        
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1990, 2, 2);
        Period period = Period.between(now, then);
        System.out.println(period);

        
    }    
}
