
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S10_134_ArrayArrayListDiff {

    public static void main(String[] args) {

        // Converting an Array into ArrayList
        String[] array1 = new String[] { "one", "two", "three" };
        var arrayList1 = Arrays.asList(array1);
        System.out.println(arrayList1);

        System.out.println("-".repeat(32));
        String[] array2 = new String[]{ "one", "two", "three" };
        List<String> arrayList2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println(arrayList2);

        
        // Convert ArrayList to array
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        // String[] array = arrayList.toArray(new String[0]);
        String[] array = arrayList.toArray(new String[arrayList.size()]); //same same 
        System.out.println("-".repeat(32));
        System.out.println(Arrays.toString(array));
    }

}
