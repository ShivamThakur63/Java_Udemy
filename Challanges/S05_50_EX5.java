public class S05_50_EX5 {
    // write code here
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    return false;
                }
                    return true;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(1992));
    }
} 
    

