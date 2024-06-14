package EX01_20;

public class S05_50_EX7 {
    
    public static boolean hasEqualSum(int Number1,int Number2,int Number3){
        //In this It Will Return true if any Two Variable Sum Is The Result Of The Next Variable
        if(Number1+Number2==Number3){
            return true;
        }else if(Number2+Number3==Number1){
            return true;
        }else if(Number1+Number3==Number2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 05, 03));
    }
}
    

