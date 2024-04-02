//  Challenge : To sort an error in descending order

import java.util.Arrays;
import java.util.Random;

public class S09_122_Array 
{
    public static void main(String[] args) {

        int [] array = new int[3];
        // int [] anotherarray = new int[10]; 
        boolean loop = true;
        Random random = new Random();
        for(int i = 0 ; i < array.length ; i++)
        {
            array[i]=random.nextInt(101);
        }

        System.out.println("-".repeat(32));
        System.out.println(Arrays.toString(array));
        // Arrays.sort(array);
        // System.out.println("-".repeat(32));
        // System.out.println(Arrays.toString(array));

        
        // for(int i = array.length-1 ; i >= 0 ; i-- )
        // {
        //     anotherarray[anotherarray.length - 1 - i] = array[i];
        // }
        // System.out.println("-".repeat(32));
        // System.out.println(Arrays.toString(anotherarray));


        // Sorting by Swapping Values 
        
        System.out.println("-".repeat(32));
        while(loop)
        {
            loop = false;
            for(int i = 0 ; i < array.length-1 ; i++)
            {
                if(array[i]<array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]  = temp;
                    loop = true;
                }

            }

        }
        System.out.println("-".repeat(36));
        System.out.println(Arrays.toString(array));

    }
}
