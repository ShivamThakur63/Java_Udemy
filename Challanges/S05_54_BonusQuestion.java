public class S05_54_BonusQuestion {
    //This New Process is Done because Last Process Was Also Coverting Negative Number Into seconds And Minute
    public static void main(String[] args) {
        System.out.println(getDurationString(3610));
        System.out.println(getDurationString(-3945));  
        System.out.println(getDurationString(-65, 45));  
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
       
    }
    public static String getDurationString(int Second){
        
        if(Second < 0){
            return "Invalid data for Seconds (" + Second +"), must be between 0 and 59";
        }
        return getDurationString(Second%60, Second/60);
    }
    public static String getDurationString(int Second,int Minute){
        int Hour =0;
        if(Minute<0){
            return "Invalid data for Minutes ("+Minute+"),must be a Positive Integer Value";
        }
        if(Second<0 || Second>=59){

            return  "Invalid data for Second ("+Second+"),must be a Positive Integer Value";
        }
            Hour=Minute/60;
        int remainingMinutes = Minute%60;
       
        return Hour +"h " +remainingMinutes +"m "+Second +"s";

    }
    
    
}
