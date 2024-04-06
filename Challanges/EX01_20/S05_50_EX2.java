public class S05_50_EX2 {
    
        // write code here
        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour<0){
                return -1;
            }else{
                double abcd = kilometersPerHour/1.609;
                
                abcd = Math.round(abcd);
                long abc = (long) abcd;
                return abc;
            }
        }
        public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour<0){
                System.out.println("Invalid Value");
            }else{
                long abcd2 = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + abcd2 + " mi/h");
                
            }
        }
    }
