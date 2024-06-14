public class S06_61_PrimeNumber {

    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
            
        }
        return true;
    }

    public static void countPrime(int number,int count){
        for(int j=1;j<=number&&count <3;j++){
            if(isPrime(j)){
                System.out.println(j+" Is A Prime Number");
                count++;
                //Since We are Only Asked For the First Three Prime Number
                // We Need To Exit From loop Using break Statement
                if(count == 3) {
                    System.out.println("Found 3 - Exiting For Loop");
                    break;
                }
            }
        }
        //If We Were Asked to Print All The Number We Had to uncomment This Statement
          //  System.out.println("The Total Number Between 1 "+ "and " +number +" Is "+count);
    }
  
    public static void main(String[] args) {
        countPrime(500, 0);
    }
}