package Challenges.EX21_40;
public class S06_70_EX26 {
   
    //Note : Also Cheak The Code Down Below For Clear And Consize Code
    
        public static int getLargestPrime(int number){
            if(number < 2){
                return -1;
            }
    
            int largestPrime = -1;
    
            for(int i = 2; i <= number; i++){
                if(number % i == 0){
                    int j;
                    for(j = 2; j < i; j++){
                        if(i % j == 0){
                            // i is not a prime number, break out of the loop
                            break;
                        }
                    }
    
                    // If the loop completed without break, i is a prime number
                    if(j == i){
                        largestPrime = i;
                    }
                }
            }
    
            return largestPrime;
        }
    
        public static void main(String[] args) {
            // Example usage
            int result = getLargestPrime(21);
            System.out.println("Largest Prime Factor: " + result);
        }
    }

    //This is Also A Great Method For Cheaking Values Using Boolean

    //  for(int i = 2; i <= number; i++){
    //         // Check if i is a factor of the given number
    //         if(number % i == 0){
    //             boolean isPrime = true;

    //             // Check if i is a prime number
    //             for(int j = 2; j < i; j++){
    //                 if(i % j == 0){
    //                     isPrime = false;
    //                     break;
    //                 }
    //             }

    //             // If i is a prime number, update the largestPrime variable
    //             if(isPrime){
    //                 largestPrime = i;
    

