public class S06_69_EX18 {
    public static int getEvenDigitSum(int number){
        int Sum = 0;
        if(number<0){
            return -1;
        }
        while(number!=0){
            if(number%2==0){
                Sum+=number%10;
            }
            number=number/10;
        }
        return Sum;
    }
    public static void main(String[] args) {
        System.out.println("The Sum Of Even Number In This Number Will Be "+getEvenDigitSum(988824231));
        System.out.println("The Sum Of Even Number In This Number Will Be "+getEvenDigitSum(-87));
        System.out.println("The Sum Of Even Number In This Number Will Be "+getEvenDigitSum(1357997531));

    }
    
}
