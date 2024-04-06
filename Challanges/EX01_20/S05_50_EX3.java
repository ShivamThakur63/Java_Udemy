public class S05_50_EX3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

        // write code here
        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            if(kiloBytes<0){
                System.out.println("Invalid Value");
            }else{
               
                int megaBytes=0;
                int kilobytes = kiloBytes;
                
                while(kilobytes >= 1024){
                //It Will Perform Loop Until And Unless The Value of kilobyte is Less Than 1024
                //And The Value of Kilobyte will keep updating because of the statement Below
                    kilobytes = kilobytes - 1024;
                    megaBytes = megaBytes + 1;
                }
                
                // int megaBytes=kiloBytes/1024;
                // int kiloBytes2 = kiloBytes%1024;
                
                
                System.out.println(kiloBytes +" KB = "+ megaBytes + " MB and " + kilobytes+ " KB");
            }
        }
    
}
