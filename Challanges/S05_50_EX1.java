import java.util.Scanner;
public class S05_50_EX1 {
    // write code here
    public static void checkNumber(int number){
    
    if(number>0){
        System.out.println("positive");
    }
    else if(number<0){
        System.out.println("negative");
    }
    else {
        System.out.println("zero");
    } 
    
    }
    public static void main(String[] args) {
        System.out.println("Please Enter The Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        checkNumber(number);
        sc.close();
    }
}