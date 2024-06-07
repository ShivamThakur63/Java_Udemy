package Concepts.Java08.PredFunConSup;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    - Whats a Predicate in Java ?
      Predicate is a functional interface which is present in the "java.util" package 
      Predicate is a boolean valued funtion  
      Lambda Expression can be used in predicate because its an functional interface and includes only one abstract method 
      With this we store condition within a variable which is really helpful for complex questions
      
      It is used to check statement for more clarity its just a replacement for if else statement and condition checking 
      so whats the need for it if we already had if else statement It is because when we are working with stream we really need it .

      It takes a generic type object as a parameter.


      It has a total of 4 method 
        - test() ( Abstract Method )
        - 


 */

public class InPredicate {

  public static void main(String[] args) {
    Predicate<Integer> salaryGreaterThanOneLakh = n -> n > 100000;

    int shivamSalary = 120000;

    System.out.println(salaryGreaterThanOneLakh.test(shivamSalary));

    // Previously
    if (shivamSalary > 100000) {
      System.out.println("Shivam salary is greater than 1 Lakh");
    }

    // Now with predicate
    if (salaryGreaterThanOneLakh.test(shivamSalary)) {
      System.out.println("Shivam salary is greater than 1 Lakh");
    }





    Predicate<Integer> isEven = x -> x%2 == 0 ;
    List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7);

    for (Integer integer : numbers1) {
      if (isEven.test(integer)) {
        System.out.print(integer +"  ");
      }
    }



    Predicate<String> startsWithLetterV = x -> x.trim().toLowerCase().charAt(0) == 'v';
    Predicate<String> endsWithLetterL = x -> x.trim().toLowerCase().charAt(x.length()-1) == 'l';
    Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
    Predicate<String> or = startsWithLetterV.or(endsWithLetterL);
    Predicate<String> negate = (startsWithLetterV.or(endsWithLetterL)).negate();
    Predicate<Object> isequal = Predicate.isEqual("Vipul");
    Predicate<Object> isequalTo1 = Predicate.isEqual(1);

    System.out.println(and.test("Shivam"));
    System.out.println(or.test("PrafuL"));

    System.out.println(startsWithLetterV.and(endsWithLetterL).test("Vipul"));
    System.out.println(startsWithLetterV.test("Vipul"));
    System.out.println(negate.test("vipul"));
    System.out.println(startsWithLetterV.test("Shivam"));

    System.out.println(startsWithLetterV.negate().test("Vipul"));


    List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int sum = numbers2.stream().filter(n -> n % 2 == 0 ).mapToInt(n -> n).sum();



    Student s1 = new Student(1, "Shivam Thakur");
    Student s2 = new Student(2, "Tashi Lama");

    Predicate<Student> studentPredicate = x -> x.getId() > 1;
    System.out.println(studentPredicate.test(s2));
    System.out.println(studentPredicate.test(s1));
    System.out.println(isequal.test("Vipul"));
    System.out.println(isequalTo1.test(12));


  }

  // If we can make a function simply then why dont we use function which we used to do previously
  // - It looks good compared to function which is obvious
  // - Stream uses predicate to check something.
  public boolean isGreaterThanOneLakh(int salary) {

    if (salary > 100000) {
      return true;

    } else {

      return false;
    }

  }

}


class Student {

  private int id;
  private String name;

  public Student(int id,String name)
  {
    this.id = id;
    this.name= name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  

}