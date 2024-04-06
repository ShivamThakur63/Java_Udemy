public class S06_62_EX15 {
    // write code here
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2==0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start ,int end){
        int sum=0;
        if((end<start)||(end<0)||(start<0)){
            return -1;
        }
        
        for(int i = start;i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
            
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(13, 13));
    }
}