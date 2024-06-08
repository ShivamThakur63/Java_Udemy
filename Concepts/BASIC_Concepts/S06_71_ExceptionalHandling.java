package Concepts.BASIC_Concepts;


//Exceptional is An Error that Happens in Code. 
//Some Type Of Error Can Be Predicted And Named.
//One Can Know Different Types Of Exception On Oracle Web Page 
//We Can Figure Out And Solve The Exception By Using Try And Catch Statement

    // try {
    //     //statements that might get errors
    // }catch (Exception e) {  //Excetion ->Type Of Error & e->variable Name
    //     //code to handle the exception
    // }

//Real Life Example Down Below

import java.util.Scanner;

public class S06_71_ExceptionalHandling {
    public static String getInputFromScanner(int CurrentYear) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hi ,Whats Your Name?");
        String name = sc.nextLine();
        System.out.println("Hi "+name+",Thanks for Taking The Course");
        System.out.println("What Year Were You Born ?");

        boolean validDOB =false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= "+(CurrentYear-125)+ " and <= "+(CurrentYear));

            //This Will First Perform The Fuction And If It encounters Any Error Related To Number Format 
            //Then It Will Perform The Catch Function To Solve This Issue
         try {
         age = cheakDate(CurrentYear, sc.nextLine());
         validDOB=age<0?false:true;
         } catch (NumberFormatException badUserValue){ 
            //In This It Will Try to solve The Issue But We Are Not Really Solving This Issue We Will Just Print To Try Again As The Format Is not Okay
            System.out.println("Characters Not Allowed !!! Try Again");
         }
    } while (!validDOB);

        sc.close();
        return "So You Are " + age + " years old ";
    }    

    public static int cheakDate(int currentYear,String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob<minimumYear) || (dob>currentYear)) {
            return -1;
        }
        return (currentYear-dob);
    }
    public static void main(String[] args) {
        System.out.println(getInputFromScanner(2023));
    }
}
