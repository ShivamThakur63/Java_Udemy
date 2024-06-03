
package Concepts.ArrayList;
 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = { "apples", "bananas", "milk", "eggs" };

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList); // add one list to another list

        System.out.println(groceries);

        if (groceries.contains("yogurt")) {
            System.out.println("List Includes Yogurt.");
            System.out.println("First Index : "+groceries.indexOf("yogurt")); // First Occurence

            // Last Index Of :
            /*
             * The lastIndexOf() method takes a single parameter. If the same element obj is
             * present in multiple locations, then the position of the element that appears
             * last is returned.
             */
            System.out.println("Last Index : "+groceries.lastIndexOf("yogurt"));
        }

        // Removing A Particular and many item at a time
        System.out.println("-".repeat(32));
        System.out.println(groceries);
        groceries.remove("milk");
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.addAll(List.of("guava","pineapple","cadboury"));
        System.out.println(groceries);
        groceries.removeAll(List.of("mustard","cheese"));
        System.out.println(groceries);

        groceries.retainAll(List.of("eggs","pickles","guava","cadbury")); // Will Make Sure Only Those Elements mentioned will stay in the Arraylist
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("Is it Empty : "+groceries.isEmpty());


        groceries.addAll(List.of("apples", "bananas", "milk", "eggs" ,"pickles","guava","cadbury"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
