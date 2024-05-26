
public class V78_MultipleCatch {

    public static void main(String[] args) {
        int num = 4;
        int arr[] = { 3, 4, 5 };
        try {
            int result = 40 / num; // we donot know what does user pass the value of num then we put inside try
            System.out.println(arr[result]); // we donot know what the value of result but we know index of array
                                             // allowed is 0 to 2 therefore we put this statement also in try
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }

        catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println(aio);
        }

        // Never Do This Cause We already Catched All Exception So No Need For ArithmeticException at Button (Compile Time Error):
        /* 
          try{
          int b = 3/a;
          System.out.println(arr[b]);
          }
          catch(Exception e){
          System.out.print("parent class of every exception");
          }
          catch(ArithmeticException e){
          }
          
         */
          //Right Way 
        /* 
          int a = 10;
          int arr[]={3,4,5};
          try{
          int b = 3/a;
          System.out.println(arr[b]);
          }
          catch(ArithmeticException e){
          }
          catch(Exception e){
          System.out.print("parent class of every exception");
          }
         */
    }
}
