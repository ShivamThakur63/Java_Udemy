package Concepts.CollectionFrameWork;

import java.util.Arrays;

/*
 * All these Function works on primitive Array Class not on ArrayList Class
 * - searching
 * - sorting 
 * - ArrayList Conversion
 * - filling up whole array with certain value 
 * - checking if two arrays are equal or not 
 * - binary search 
 */
public class ArrayClass {
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        // Binary Search is efficient because it operates quickly by leveraging 
        // the quick sort algorithm, and it determines the target value by comparing 
        // it to the middle value, then adjusting the search range accordingly.  

        int index = Arrays.binarySearch(numbers, 4); // binary search only works with sorted arrays

        System.out.println("The index of element 4 in the array is "+ index);

        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);  // uses multi threading technique to process parallely but is only suitable with more than 8192 elements otherwise it uses quicksort 

        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Previously : "+ Arrays.toString(numbers));


        // fill() --> fill number with certain value 
        Arrays.fill(numbers, 1);

        System.out.println("Updated : "  + Arrays.toString(numbers));
    }
}
