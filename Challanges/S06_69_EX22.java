public class S06_69_EX22 {
        
        public static int getGreatestCommonDivisor(int first,int second){
            int GreatestCommonFactor =1;
            
            //We Did It To Find the Minimum So It Will Ease Our Calculation
            int min=(first<second)?first:second;
            
            if(first<10||second<10){
                return -1;
            }
            
            
            for(int i=min;i<=i;i--){
                
                int remainder1 = first%i;
                int remainder2 = second%i;
                        
                        if((remainder2==0)&&(remainder1==0)){
                            GreatestCommonFactor =i;
                            break;
                        }
                }
                
            return GreatestCommonFactor;
        }
        
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(20, 50));
    }
    
}
