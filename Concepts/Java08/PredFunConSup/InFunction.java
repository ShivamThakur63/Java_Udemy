package Concepts.Java08.PredFunConSup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
    Whats a function?
    A Function is a functional interface which does some work and actions and returns the result.
    
 */

public class InFunction {

    public static void main(String[] args) {
        
        Function<String,Integer> getLength = x -> x.length();
        Function<String,String> getFirstThree = x -> x.substring(0, 3);
        Function<List<Student1>,List<Student1>> studentWithVipAsPrefix = li -> {
            List<Student1> result =new ArrayList<>();
            for (Student1 s : li) {
                if(getFirstThree.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };
        
        
        
        
        
        
        
        
        
        
        
        Function<List<Student1>,List<String>> firstThreeLettersOfStudent = x -> {
            List<String> output =new ArrayList<>();
            x.forEach( y -> {
                String result = y.getName();
                output.add((getFirstThree.apply(result)));
                
        });
            return output;
        };

        List<Student1> students = Arrays.asList(new Student1(1, "Shivam Thakur"),new Student1(5, "Viplav"),new Student1(7, "Vipul"),new Student1(2, "Pushkar Sah"),new Student1(3, "Binayak Prajapati"),new Student1(4, "Vipunya "));

        List<String> value = firstThreeLettersOfStudent.apply(students);

        System.out.println((value));
        
        System.out.println(getLength.apply("Shivam Kumar Thakur"));









        List<Student1> student = studentWithVipAsPrefix.apply(students);
        System.out.println(student.toString());











        // <<<< ----------------------------- Function Chaining  ----------------------------- >>>>


        // andThen Function     - one after another 

        Function <String , String> toUpper = s -> s.toUpperCase();

        Function<String,String> stringFunctiion = toUpper.andThen(getFirstThree);

        System.out.println(stringFunctiion.apply("Shivam"));


        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer,Integer> function2 = x -> x * x * x;

        System.out.println(function1.andThen(function2).apply(3)); // 216
        System.out.println(function2.andThen(function1).apply(3));  // 54


        //  Compose  - Just opposite for andThen 
        System.out.println(function1.compose(function2).apply(3));  // 54


        // Identity -- Whatever you give as an input it will return as an output No Rocket Science 
        Function<String,String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Vipul"));
    }
    // Identity Function 
    private Object identityFunction(Object s)
        {
            return s;
        }


    
}



class Student1 {

    private int id;
    private String name;
  
    public Student1(int id,String name)
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

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    

   
    
  
  }