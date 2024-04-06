public class S05_53_SECONDMINUTE {

   public static String getDurationString(int Second) {
   int Minute = Second / 60;
   return getDurationString(Second, Minute);

   }
   public static String getDurationString(int Second,int Minute){
   int remainingMinutes = Minute%60;
   int remainingSeconds = Second%60;
   int Hour = Minute/60;

   return Hour +"h " +remainingMinutes +"m "+remainingSeconds +"s";

   }

   //Another Method With While Statement

   // public static void getDurationString(int second) {
   //    int minute = 0;
   //    while (second > 59) {
   //       second -=60;
   //       minute += 1;
   //    }
   //    int hour = 0;
   //    while (minute > 59) {
   //       minute -=60;
   //       hour += 1;
   //    }
   //    System.out.println(hour + " h " + minute + " m " + second + " s ");

   // }

   public static void main(String[] args) {
      System.out.println(getDurationString(3600));
   }
}
