import java.util.Arrays;

public class S09_124_ReferenceArray {
    
    public static void main(String[] args) {
        
        int [] array = {2,3,4,1,3,23,91,02};
        int []refarray = array;
        String a [] = "Shivam Thakur".split(" ");

        printWord(a);
        

        System.out.println("Original Array Before Changing my RefArray "+ Arrays.toString(array));
        System.out.println("Reference Array Before Changing my RefArray "+ Arrays.toString(refarray));

        System.out.println("-".repeat(32));

        // Change The Value Of The Reference Variable 
        refarray[0] = 1;
        modifyArray(array);

        System.out.println("Original Array After Changing my RefArray "+ Arrays.toString(array));
        System.out.println("Reference Array After Changing my RefArray "+ Arrays.toString(refarray));
    }
    private static void modifyArray(int [] array)
    {
        array[1]=2;

        // modifyArray(array);
        // array
        // refarray
        // All This Reference to the Same Array of the List 
    }


    public static void printWord(String[] a){
        for(String i : a){
            System.out.println(i);
        }
    }
}


