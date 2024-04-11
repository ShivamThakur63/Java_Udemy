public class S05_56_EX11 {
        public static void printEqual(int x,int y,int z){
        // write code here
        if(x<0||y<0||z<0){
            System.out.println("Invalid Value");
        }else if(x==y&&y==z){
            System.out.println("All numbers are equal");
        }else if(x==y||y==z||z==x){
            System.out.println("Neither all are equal or different");
        }else{
            System.out.println("All numbers are different");
            }
        }
    public static void main(String[] args) {
        printEqual(1,2 ,3);
        printEqual(-1, 3, 23);
        printEqual(23, 32, 23);
        printEqual(7, 7, 7);
    }
    
}
