package EX01_20;

public class S05_50_EX4 {
        // write code here
        public static boolean shouldWakeUp(boolean barking,int hourOfDay){
            if(hourOfDay<0 || hourOfDay>23){
                return false;
            }
            else{
               if((hourOfDay<8 || hourOfDay>22) && barking==true){
                   return true;
            }
            else{
                return false;
            }
        }
   }
        public static void main(String[] args) {
            System.out.println(shouldWakeUp(true, 0));
    
   }
}
    

