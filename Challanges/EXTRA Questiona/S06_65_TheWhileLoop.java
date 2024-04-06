public class S06_65_TheWhileLoop {
    public static boolean isEvenNumber(int number){
        if((number%2)==0){
            return true;
        }else{
        return false;
    }
}
    public static void main(String[] args) {
        int number=5;
        int EvenCount=0;
        int OddCount=0;
        int finishNumber=20;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                OddCount++;
                continue;
            }
            System.out.print(number+" , ");
                EvenCount++;
                if(EvenCount>4){
                    break;
                }
        }
        System.out.println();
        System.out.println("Even Count Is "+EvenCount);
        System.out.println("Odd Count Is "+OddCount);
        }
    
        
    }

