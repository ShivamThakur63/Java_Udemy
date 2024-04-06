package EX01_20;
public class S06_69_EX20 {

     public static boolean isValid(int number){
        //One can easily replace this by writing it in return statement looks more clear and awesome.

            if(number>=10&&number<=1000){ 
                return true;
            }
            //return (number>=10&&number<=1000);

            return false;
        
        }
//This Shit Is Ugly And It Really looks Like A Piece Of Shit

//This Is A long And More Clear One But Down Below is The More Efficient One And Simple One Using The isValid Function

        // public static boolean hasSameLastDigit(int Number1,int Number2,int Number3) {
            
        //     int LastDigit1=Number1%10;
        //     int LastDigit2=Number2%10;
        //     int LastDigit3=Number3%10;
            
        //     if(((Number1>=10)&&(Number1<=1000))&&((Number2>=10)&&(Number2<=1000))&&((Number3>=10)&&(Number3<=1000))){    
        //Range Of The Number
                
        //         while((LastDigit1==LastDigit2)||(LastDigit1==LastDigit3)||(LastDigit2==LastDigit3)){
        //             return true;
        //         }
                
        //     }
        //     return false;
            
        // }

        public static boolean hasSameLastDigit(int a,int b,int c){

            int last1=a%10;
            int last2=b%10;
            int last3=c%10;
            if(isValid(a)||isValid(b)||isValid(c)){

                return (last1==last2)||(last1==last3)||(last2==last3);
            }
            return false;
        }
        
       
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21, 710, 31));
        System.out.println(hasSameLastDigit(20, 21, 33));
        System.out.println(isValid(31));
        System.out.println(isValid(2222));
    }
}
