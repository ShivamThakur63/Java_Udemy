import java.util.Arrays;
import java.util.Scanner;

public class S10_126_MinArrayElement 
{
    public static void main(String[] args) 
    {
        int[] demoArray = readElement();
        System.out.println("-".repeat(32));
        System.out.println(Arrays.toString(demoArray));
        System.out.println("-".repeat(32));
        System.out.println("Minimum : "+getMinElement(demoArray));
        System.out.println("-".repeat(32));
        System.out.println("Maximun : "+getMaxElement(demoArray));
    }

    public static int[] readElement()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Elements Of The Array, Seperate By Commas : ");
        String input = sc.nextLine();
        String [] array =input.split(",");
        int [] output = new int[array.length];

        for(int i =0;i<array.length;i++)
        {
            output[i]=Integer.parseInt(array[i].trim()); // remove whitespace at beginning and ending of the string
        }

        sc.close();
        return output;
    }

    public static int getMinElement(int[] array )
    {
        int minElement = array[0];
        for(int i = 0;i<array.length;i++)
        {
            if(array[i]<minElement){
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int getMaxElement(int[] array )
    {
        int maxElement = array[0];
        for(int i = 0;i<array.length;i++)
        {
            if(array[i]>maxElement){
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
