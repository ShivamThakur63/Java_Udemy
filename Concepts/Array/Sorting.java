
package Concepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array1 = { 2, 4, 43, 13, 4, 1, 0, 03, 23, 41, 11, 22 };
        sortInteger(array1, sc);

    }

    public static void sortInteger(int[] array, Scanner sc) // Will Use Bubble Sort First
    {

        System.out.printf("""
                You Want To Use BubbleSort / QuickSort ?
                Answer : """);
 
        String answer = sc.nextLine();

        if (answer.toLowerCase().equals("bubblesort")) {

            System.out.println("Hey You Choose Bubble Sort .");
            bubblesort(array);

        } else if (answer.toLowerCase().equals("quicksort")) {
            System.out.println("Hey You Choose QuickSort . ");
            quicksort(array, 0, array.length - 1);
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Please Choose Quicksort Or BubbleSort .");
        }

    }

    private static void bubblesort(int[] array) {

        boolean sorted = false;
        do {
            sorted = false;
            int n = array.length;

            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = true;
                }
            }
            n--;
        } while (sorted);
        System.out.println(Arrays.toString(array));

    }

    private static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = getPivot(array, start, end);
            quicksort(array, start, pivot - 1);
            quicksort(array, pivot + 1, end);
        }
    }

    private static int getPivot(int[] array, int start, int end) {
        int point = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < point) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = point;
        array[end] = temp;

        return i;
    }
}
