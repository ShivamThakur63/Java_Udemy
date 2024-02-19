public class S05_50_EX6 {

        public static boolean areEqualByThreeDecimalPlaces(double Number1,double Number2 ){
            
            //By Multiplying 1000 it will just add the last three decimal number into the main number
            //And Then By Casting Double to Int We Just Ignore the Rest of the Decimal Number
            Number1=(int) (Number1*1000);
            Number2=(int) (Number2*1000);
            
            if(Number1==Number2){
                return true;
            }
        return false;
        
        }
    
        public static void main(String[] args) {
            double Number1=111.11123;
            double Number2=111.12165;
            System.out.println(areEqualByThreeDecimalPlaces(Number1,Number2));
        }
    }