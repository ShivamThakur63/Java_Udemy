package Challenges.EX41_60;

import java.util.Arrays;

public class S09_127_EX43 {
    // write code here
    private static void reverse(int[] array)
    {
        System.out.println("Array = "+Arrays.toString(array));
        int half = array.length / 2;
        int max = array.length - 1 ;

        for(int i = 0 ; i < half ; i ++)
        {
            int temp = array[max-i];
            array[max-i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}