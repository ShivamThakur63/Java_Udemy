public class S06_69_EX21 {
    
        public static void printFactors(int number){
            
            if(number<1){
            System.out.println("Invalid Value");
            return ;
            }
            
            for(int i=1;i<=number;i++){
                //Remainder declared for better understanding
                  int remainder = number%i; 
                    if(remainder==0){
                       System.out.print(i+" ");
                    }
                }
            }
            public static void main(String[] args) {
                printFactors(20);
            }
    }

