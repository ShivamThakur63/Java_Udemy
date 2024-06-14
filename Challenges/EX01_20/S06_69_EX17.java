package Challenges.EX01_20;

public class S06_69_EX17 {
        // write code here
        public static int sumFirstAndLastDigit(int number){
            
            int LastDigit=number%10;
            
            if(number<0){
                return -1;
            }
            while(number>=10){
                number=number/10;
            }
            int first=number;
            
            return LastDigit+first;
        }
        public static void main(String[] args) {
            
            System.out.println("The Sum Of The First And Last Digit Of The Last Number Is "+sumFirstAndLastDigit(0));

                        System.out.println("The Sum Of The First And Last Digit Of The Last Number Is "+sumFirstAndLastDigit(-66));

                                    System.out.println("The Sum Of The First And Last Digit Of The Last Number Is "+sumFirstAndLastDigit(3034));

                                                System.out.println("The Sum Of The First And Last Digit Of The Last Number Is "+sumFirstAndLastDigit(12347));

            
        }
    }

