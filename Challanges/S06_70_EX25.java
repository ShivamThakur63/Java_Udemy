public class S06_70_EX25 {

    //This is a Standard Process And More Good Approach To Follow Rather Than The Below One 
    //However There Is Still A While Condition Statement For Context
 
        private static final int BIG_WEIGHT = 5;
     
        public static boolean canPack(int bigCount, int smallCount, int goal) {
            
            if (bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }
     
            boolean result = false;
            int totalBigWeight = bigCount * BIG_WEIGHT;
            if (totalBigWeight >= goal) {
                int remaining = goal % BIG_WEIGHT;
                if (smallCount >= remaining) {
                    result = true;
                }
            } else {
                if (smallCount >= goal - totalBigWeight) {
                    result = true;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(canPack(2,1, 11));
            System.out.println(canPack(2,16, 89));
            System.out.println(canPack(2,45, 11));
            System.out.println(canPack(45, 32,11));



        }
    }
    
     
    //This Method Is Only For Educational Purposes Only 
    //Dont You Dare Repeat This Bullshit Logic And Use Some Simpler Logic To Perforn Function
    
   
//     public static boolean canPack(int bigCount,int smallCount , int goal){

//             //Variables Declared
//             int final1=0;   //This Will Be Used To Fill The Goal One By One
//             int count =0;   //This Will Count The Big Packets
//             int count2=0;   //This Will Count The Small Packets
            
//             //This Is For A Big Packet Case
//            while(goal > final1){
               
//                if((count==bigCount)||((goal-final1)<5)||(bigCount<1)){
//                    break;
//                }
//                final1 +=5;
//                count ++;
              
//                if(goal==final1){
//                    return true;
//                }
//            }
           
//            //This Is For The Smaller Packet
//            while(goal>final1){
//                if(count2>=smallCount){
//                    break;
//                }
//               final1 +=1;
//               count2++;
//               if(goal==final1){
//                   return true;
//               }
              
//         }
//         return false;
//         }
    
// }


