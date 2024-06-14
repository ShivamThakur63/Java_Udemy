import java.util.Scanner;
public class S06_70_SumOfInput {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//     String a,b,c,d,e;
//     System.out.print("Enter Number #1 :");
//     a=sc.nextLine();
//     System.out.print("Enter Number #2 :");
//     b=sc.nextLine();
//     System.out.print("Enter Number #3 :");
//     c=sc.nextLine();
//     System.out.print("Enter Number #4 :");
//     d=sc.nextLine();
//     System.out.print("Enter Number #5 :");
//     e=sc.nextLine();

    
//     sc.close();

//     System.out.println("The Sum Of All The Inputs Are " +(Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d)+Integer.parseInt(e)));
// }

    int count=1;
    double sum=0; // datatype will be double if we want to also include decimal values

    while(count<=5){
        System.out.print("Enter Number #"+count+ " :");
        String a=sc.nextLine();
        try{
        sum+=Double.parseDouble(a);
        //sum+=Integer.parseInt(a); //Use Double If You Want To Store Decimal Values
        count++;
        }catch(NumberFormatException e){
            System.out.println("Invalid Value");
        }
        sc.close();
    }
    System.out.println("The Sum Of All Those Number Will Be " + sum);
}
}