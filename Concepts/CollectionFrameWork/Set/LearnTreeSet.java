package Concepts.CollectionFrameWork.Set;

import java.util.Set;
import java.util.TreeSet;

/*
 * How is it different from Hashset and LinkedHashSet ?
 * - Behined the scene it does every thing on sorted basis 
 * - it is implementation of binary search tree and also defines set 
 *   property which make all the element unique and also in sorted manner.
 * 
 * So, if you want to make a set and also in sorted from then we can use Tree Set.
 * 
 *  Time Complexity :
 * 1) HashSet : BigO1 (Very Optimized)
 * 2) TreeSet : BigOlog(n) (Not much efficient)
 * 
 * Important : As we all know that treeSet primarly sorts all the element of primary 
 * Data Type on the basic of their natural order i.e as they implement the Comparable 
 * Interface So for that we cannot use a custom object in the TreeSet without implementing 
 * the Comparable interface and if we will do that then treeSet will have an idea will one is 
 * greater than other in order to sort 
 * 
 * ***Important :
 * 1) Comparable -> Sorting
 * 2) Equals and HashCode -> for checking for same value as set only allows unique element.
 * 
 * Note : 
 * Even if you don't override the equals and hashCode methods, the TreeSet will still 
 * use the compareTo method to determine if two objects are the same.


 */
public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();

        ts.add(20);
        ts.add(100);
        ts.add(10);
        ts.add(30);

        System.out.println(ts);

        // For Student

        Student e5 = new Student("50 Cent", 1);
        Student e6 = new Student("Eminem", 2);
        Student e7 = new Student("Akon", 3);
        Student e8 = new Student("50 Cent", 4);
        Student e11 = new Student("Sean Kington", 1);

        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(e5);
        studentSet.add(e6);
        studentSet.add(e7);
        studentSet.add(e8);
        studentSet.add(e11);

        System.out.println(studentSet);

        // For Employee without Overriding the Hashcode and .equals() method

        Employee e1 = new Employee("50 Cent", 1);
        Employee e2 = new Employee("Eminem", 2);
        Employee e3 = new Employee("Akon", 3);
        Employee e4 = new Employee("Jon Lajoie", 4);
        Employee e10 = new Employee("Jon Lajoie", 1);

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e10);

        System.out.println(employeeSet);

    }
}
