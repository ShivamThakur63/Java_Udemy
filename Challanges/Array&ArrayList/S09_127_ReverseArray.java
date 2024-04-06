import java.util.Arrays;

public class S09_127_ReverseArray 
{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int[] reversed = getReversed(array);
        System.out.println("-".repeat(32));
        System.out.println(Arrays.toString(reversed));
        System.out.println("-".repeat(32));
        System.out.println("Before Reversing :");
        System.out.println(Arrays.toString(array));
        System.out.println("-".repeat(32));
        System.out.println("After Reversing :");
        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse));

 
    }
    
    public static int[] getReversed(int[] array)
    {
        int max = array.length - 1 ;
        int[] reverseCopy = new int[array.length];

        for(int i : array)
        {
            reverseCopy[max--] = i ;
        }

        return reverseCopy;
    }

    public static int [] reverse(int[] array)
    {
        int half = array.length / 2;
        int max = array.length - 1 ;

        for(int i = 0 ; i < half ; i ++)
        {
            int temp = array[max-i];
            array[max-i] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
