package Concepts.Sorting_Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 82, 34, 1, 20, 10,0 };
        int n = arr.length;

        System.out.println("-".repeat(32));
        System.out.println("Before Sorting");
        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println("-".repeat(32));
        System.out.println("Sorting Process");
        bubbleSort(arr, n);

        System.out.println("-".repeat(32));
        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();
            for (int k : arr) {
                System.out.print(k + " ");
            }
        }
        System.out.println();
    }

}