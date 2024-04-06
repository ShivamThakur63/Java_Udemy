public class S06_62_Sum3And5 {
    public static void main(String[] args) {
        int number =1000;
        int sum =0;
        int count =0;
        //If You Dont Want To Use Break Statement Then Just Add condition to Loop
        for(int i =1;i<=number&&count<5;i++){
            if(i%3==0&&i%5==0){
                count++;
                
                sum+=i;
                System.out.println("Found A Match "+ i);

                //If You Dont Wanna Do That Way Than Follow This But Why THE F
                // You Dont Wanna Do That Way NO Extra Lines Of Code And Bullshit

                // if(count==5){
                //     break;
                // }
                
            }
           
        }
         System.out.println(sum);
    }
    
}
