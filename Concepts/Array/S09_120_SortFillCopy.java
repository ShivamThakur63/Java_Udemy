

package Concepts.Array;

import java.util.Arrays;
import java.util.Random;

public class S09_120_SortFillCopy {

    public static void main(String[] args) {

        // Generate a random array of length 10
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // Sort the firstArray
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // Create a new array of length 10 and fill it with the value 5
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // Generate another random array of length 10
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // Create a copy of the thirdArray using Arrays.copyOf()
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        // Sort the fourthArray
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        // Create a smaller array containing the first 5 elements of thirdArray
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        // Create a larger array containing the first 15 elements of thirdArray
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
    }

    // Method to generate a random array of specified length
    private static int[] getRandomArray(int len) {

        Random random = new Random(); // Is Used To Generate Random Number (int,double)
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) 
        {
            newInt[i] = random.nextInt(100); //Generate Random int values upto 100(exclusive)
        }

        return newInt;
    }
}
