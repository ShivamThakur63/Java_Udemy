import java.util.Arrays;
import java.util.Scanner;

public class S09_123_ArraySorting {
    public static void main(String[] args) {
        System.out.println("Enter The Size Of Array : ");
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int [] array = new int[size];
        // int array1[] = new int[10];
        // getIntegers(array1,size,sc);
        System.out.println("-".repeat(32));
        int[] array = { 9, 3, 43, 11, 1, 98, 40, 2, 7 };
        // sortIntegers(array);
        sortIntegers(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
        sc.close();
    }

    public static int[] getIntegers(int[] array, int size, Scanner sc) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter The Numbers at " + i + " index : ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        return array;
    }

    public static void sortIntegers(int[] array, int begin, int rest) {
        if (begin >= rest)
            return;
        int pivotIdx = getpivot(array, begin, rest);
        sortIntegers(array, begin, pivotIdx - 1);
        sortIntegers(array, pivotIdx + 1, rest);
    }

    public static int getpivot(int[] array, int begin, int rest) {
        int temp;
        int i = begin - 1;
        int pivot = array[rest];

        for (int j = begin; j < rest; j++) {
            if (array[j] < pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }

        }
        i++;
        temp = array[i];
        array[i] = array[rest];
        array[rest] = temp;

        return i;
    }
}
