package Challenges.EX21_40;
public class S06_69_EX24 {
     
     public static void numberToWords(int number){
         int reversedNO=reverse(number);
         
         int leadingZeros = getDigitCount(number)-getDigitCount(reversedNO);
         
         if(number==0){
             System.out.println("Zero");
         }
         
         if(number<0){
             System.out.println("Invalid Value");
             
         }else{
             
         while(reversedNO!=0){
         int lastDigit=reversedNO%10;
         String result;
         result = switch(lastDigit){
             case 0 ->"Zero";
             case 1 ->"One";
             case 2 ->"Two";
             case 3 ->"Three";
             case 4 ->"Four";
             case 5 ->"Five";
             case 6 ->"Six";
             case 7 ->"Seven";
             case 8 ->"Eight";
             case 9 ->"Nine";
             default ->"None";
         };
         reversedNO/=10;
         System.out.print(result+" ");
     }
     
     }
     for(int i = 0 ; i <leadingZeros; i ++){
         System.out.println("Zero");
     }
     }
        public static int reverse(int a){
            int remainder2;
            int remainder3=0;
            while(a!=0){
                remainder2=a%10;
                remainder3*=10;
                remainder3+=remainder2;
                
                a=a/10;
            }
            return remainder3;
    }
    
    public static int getDigitCount(int b){
        int count=0;
        if(b<0){
            return -1;
        }
        while(b>=0){
            count++;
            b=b/10;
            
            if(b==0){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(10110);
        numberToWords(123);
        System.out.println();
        System.out.println(getDigitCount(3212));
        System.out.println(reverse(3232));
    }
}