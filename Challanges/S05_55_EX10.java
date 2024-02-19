public class S05_55_EX10 {
    // write code here
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        long days =minutes/1440;
        long years = days/365;
        long Day = days%365;
        System.out.println(minutes+" min = "+years+" y and "+Day+" d");
    }
    public static void main(String[] args) {
        printYearsAndDays(581760);
        printYearsAndDays(1788480);
    }
} 