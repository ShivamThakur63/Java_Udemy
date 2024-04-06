import java.util.*;
public class S06_74_MINAndMAX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Minimum=0;
        double Maximum=0;
        int LoopCount=0;

        while(true){
            System.out.println("Enter The Number , And Enter Character To Exit : ");
            String Input = sc.nextLine();
            
                try {
                double isValid=Double.parseDouble(Input);
                
                if((LoopCount==0)||(isValid<Minimum)){
                    Minimum=isValid;
                }
                if((LoopCount==0)||(isValid>Maximum)){
                    Maximum=isValid;
                }
                 LoopCount++;

                }catch(NumberFormatException fap){
                    break;
                }
               
            }
        
        if (LoopCount>0){
        System.out.println("Minimum Value = "+Minimum +" , Maximum Value = "+Maximum);

    }else{
        System.out.println("Invalid Number Selected");
    }
    sc.close();

    
}
}