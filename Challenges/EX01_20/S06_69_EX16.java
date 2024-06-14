package Challenges.EX01_20;

public class S06_69_EX16 {
    // write code here
    public static boolean isPalindrome(int number){
        int reverse=0;
        int original=number;
        while(original!=0){
            int lastDigit =original%10;
            reverse = reverse * 10;
            reverse+=lastDigit;
            original=original/10;
        }
        if(number==reverse){  // Change made here
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Is This A Palindrone ?");
        System.out.println(isPalindrome(123321));
    }
}
