import java.util.Arrays;

public class S09_121_BinarySearch 
{
    public static void main(String[] args) {
        
        String name[] = {"Shivam","Pushkar","Binayak","Akshay","Riken","Aarya","Abisha"};

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        if(Arrays.binarySearch(name,"Shivam")>=0 ){  // >= Checks The Index Value 
            // As The Binary Search Return index Of The Word Found and If The Word is not present it returns -1
            System.out.println("Match Found.");
        }else{
            System.out.println("Match Not Found.");
        }


        // Equality Of Arrays 
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        // Arrays.equals(array2, array3) -Compares the contents of two arrays to determine if they are equal, regardless of their memory locations.

        if(Arrays.equals(array1, array2)){
            System.out.println("Array 1 is equal to Array 2 ");
        }else if(Arrays.equals(array2, array3)){
            System.out.println("Array 2 is equal to Array 3 ");
        }else if(Arrays.equals(array1, array3)){
            System.out.println("Array 1 is equal to Array 3 ");
        }

        // However, when using the equals() method inherited from the Object class,
        // it performs reference comparison, not content comparison.
        // So, array1.equals(array2) will return false because they are different objects.
        System.out.println("array1 equals array2: " + array1.equals(array2)); // Output: false

        // In contrast, array1.equals(array3) returns true because array1 and array3
        // reference the same array object.
        System.out.println("array1 equals array3: " + array1.equals(array3)); // Output: true

     }    
}
