package Concepts.StaticNestedClass;

/*

  Sources :  JavaTpoint
  Link    :  https://www.javatpoint.com/java-inner-class
  Rating  :  10 / 10 


  Definition : - 
  In Java, an inner class or nested class is a class declared inside another
  class or interface. Inner classes help logically group classes and
  interfaces, making the code more readable and maintainable. They can access
  all members of the outer class, including private data members and methods.


   - Advantages of Inner Classes
   1.  Encapsulation and Relationship: Inner classes can access all members of the outer class, including private members, representing a tight coupling or relationship.
   2   Readability and Maintainability: Grouping related classes and interfaces together enhances code organization.
   3.  Code Optimization: Inner classes can reduce the amount of code by encapsulating functionality that is used only by the outer class.
    
   - Need for Inner Classes
   1. Encapsulation: If a class should not be accessible by any other class, nesting it within another class provides this encapsulation.
   2. Logical Grouping: When the inner class instances are closely tied to the outer class instances, it makes sense to nest the inner class.

 */



        //  <<<< --------    Static Nested Class  --------- >>>>

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args) {
    
    List<Employee> employees = new ArrayList<>(List.of(
      new Employee(1,"Shivam Thakur",2018),
      new Employee(2,"Pushkar Shah", 2015),
      new Employee(3, "Binayak Prajapati" , 2020),
      new Employee(3, "Sandesh Pandey" , 2019)));


      // var comparator = new EmployeeComparator<>();
  }
}
        