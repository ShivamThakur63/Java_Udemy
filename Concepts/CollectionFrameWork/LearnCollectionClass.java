package Concepts.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * collection Class provides function like min max frequency of an element within the list 
 */
public class LearnCollectionClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(4, 1, 4, 5, 2, 7, 9, 5, 3, 6, 10));

        System.out.println("min element : " + Collections.min(list));
        System.out.println("max element : " + Collections.max(list));

        // frequency
        System.out.println("Frequency of 4 within the list : " + Collections.frequency(list, 4));

        // sort()
        System.out.println("List Previously : " + list);
        Collections.sort(list); // if we want to reverse the list then pass Comparator after list
        System.out.println("Sorted List : " + list);

        // retai() --> will contains only the specified element in the list and delete
        // all other value than desired value
        System.out.println("List Previously  : " + list);
        list.retainAll(List.of(1, 2, 3, 4));
        System.out.println("After Retaining : " + list);

        // List.of(4, 1, 4, 5, 2, 7, 9, 5, 3, 6, 10) creates an immutable list with the
        // given elements.
        list.clear();
        list.addAll(List.of(1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 10));

        // removeAll() --> takes collection and delete all the element of list which are
        // present in the argument
        System.out.println("List Previously : " + list);
        list.removeAll(new ArrayList<>(List.of(1, 2, 3, 4)));
        System.out.println("Updated List : " + list);

        // removeIf --> deletes all the element which satisfies the Predicate
        System.out.println("List Previously : " + list);
        list.removeIf(x -> x % 2 == 0);
        System.out.println("New List : " + list);

        // containsAll() -> will return boolean value if ever value in the argument is
        // present in the list.
        System.out.println(list.containsAll(List.of(1, 2, 3)));
        System.out.println(list.containsAll(List.of(5, 7, 9)));

        List<Integer> list2 = new ArrayList<>(List.of(5, 5, 7, 9)); // order matters for two list to be equal
        // hashCode() - returns Hashcode Value
        System.out.println("HashCode Value of list1 : " + list.hashCode());
        System.out.println("HashCode Value of list2 : " + list2.hashCode());
        System.out.println("Is List 1 and List 2 equal ? \nAnswer  : " + list.equals(list2)); // order matters

        /*
         * ArrayConversion
         * toArray(): Returns Object[], which means you'll need to cast elements to
         * their appropriate type if you need to work with them in their specific type.
         * toArray(T[] a): Returns T[], which is type-safe and eliminates the need for
         * casting.
         * 
         * Why new String[0]:
         * Efficiency:
         * 
         * Creating a zero-length array (new String[0]) is efficient because it avoids
         * allocating unnecessary memory. If the array provided is of the correct size
         * or larger, it will be used directly.
         * If the array is too small (or zero-length), the method will create a new
         * array of the appropriate size internally. This is typically a negligible
         * overhead compared to passing an array of a larger size, which may be wasteful
         * if its size is not exact.
         * Type Safety:
         * 
         * By using new String[0], you ensure that the returned array is of the correct
         * type (String[] in this case) without having to cast the result.
         * 
         */

        // If we want to sort the object then we need to implement comparable or Comparator within the Class

        Employee e1 = new Employee("50 Cent", 2);
        Employee e2 = new Employee("Eminem", 1);
        Employee e4 = new Employee("Jon Lajoie", 4);
        Employee e10 = new Employee("Jon Lajoie", 1);
        Employee e3 = new Employee("Akon", 3);

        List<Employee> employeeSet = new ArrayList<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e10);

        System.out.println("Before Sorting : " + employeeSet);
        Collections.sort(employeeSet); // using comparable
        System.out.println("After Sorting : " + employeeSet);

        // but what if i want to convert it by name then
        System.out.println("Before Sorting : " + employeeSet);
        Collections.sort(employeeSet, (him, that) -> (him.name.compareTo(that.name)));
        System.out.println(employeeSet);

    }
}
