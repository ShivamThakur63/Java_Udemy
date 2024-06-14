package EX01_20;

public class S06_60_EX14 {
    // write code here
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4==0){
                if(year%100!=0){
                    return true ;
                    }else if(year%400==0){
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
}

public static int getDaysInMonth(int month,int year){
    if(month<1||month>12){
        return -1;
    }
    if(year<1||year>9999){
        return -1;
    }
    int day;
    day = switch(month){
        //We Can Also Shorten This Line of Code by using Comma(,) in  case statement as most of the values are repeated. 
        case 1-> 31;
        case 2->isLeapYear(year) ? 29:28;
        case 3-> 31;
        case 4-> 30;
        case 5-> 31;
        case 6-> 30;
        case 7-> 31;
        case 8-> 31;
        case 9-> 30;
        case 10->31;
        case 11->30;
        case 12->31;
        default->-1;
    };
        return day;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1998));
        System.out.println(isLeapYear(2016));
        System.out.println(getDaysInMonth(2, 2016));
    }


    
}
