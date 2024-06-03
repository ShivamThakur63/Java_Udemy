package Concepts.Sorting_Algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 3, 7, 5, 0 };
        int len = arr.length;
        int min = 0;
        int temp;

        System.out.println("-".repeat(32));
        System.out.println("Before Sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-".repeat(32));
        System.out.println("During Sorting");

        for (int i = 0; i < len - 1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
        System.out.println("-".repeat(32));
        System.out.println("After Sorting");

        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();
    }
}
