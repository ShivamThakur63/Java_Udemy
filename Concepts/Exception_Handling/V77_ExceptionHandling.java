package Exception_Handling;

//  try to handle the exception 
class V77_ExceptionHandling{
    public static void main(String[] args) {
       int i=4; //normal statement
       try{
             int a = 10/0; //critical statement
             /*Not handling exception then
             if you not handle the exception then it will be thrown to the JVM
             and JVM will terminate the program abnormally
             and it will not execute the remaining statements
             */
          
               /*
               if you handle the exception then it will not be thrown to the JVM
               and JVM will not terminate the program abnormally
               and it will execute the remaining statements
               */

       }catch(Exception e){
             System.out.println("Some exception occured");
       }
       System.out.println("We are coming out of the try catch block successfully");


    }
 
}