public class S06_66_DigitSum {

    public static int digitSum(int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        while (number>9){
            sum+=number%10;
            number = number/10;
        }
        sum+=number;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The Sum Of Digit In This Number Would Be "+ digitSum(-21));
        System.out.println("The Sum Of Digit In This Number Would Be "+digitSum(123456));
        System.out.println("The Sum Of Digit In This Number Would Be "+digitSum(0));
        System.out.println("The Sum Of Digit In This Number Would Be "+digitSum(333));

    }
}