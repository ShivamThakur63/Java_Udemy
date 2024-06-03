import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = { 0, 5, 10, -50, 50 };

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d compareTo = %d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);


        }

        String banana = "banana";
        String[] fruit = {"apple","banana","pear","Banana"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s compareTo = %d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);


        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
        System.out.println("A : "+(int)'A'+" "+"  a : "+(int)'a');
        System.out.println("B : "+(int)'B'+" "+"  b : "+(int)'b');
        System.out.println("P : "+(int)'P'+" "+"  p : "+(int)'p');



        Student travis = new Student("Travis Scott");
        Student [] students = {new Student("21 Savage"),new Student("Drake"),new Student("Kendrik Lamar"),new Student("Akon")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // System.out.println("Result = "+travis.compareTo("Asap"));
        System.out.println("Result = "+travis.compareTo(new Student("Asap Rocky")));
        System.out.println("Result = "+travis.compareTo(students[1]));
    

    Comparator<Student> gpaSorter = new StudentGPAComparator();
    Arrays.sort(students,gpaSorter);
    Arrays.sort(students,gpaSorter.reversed());
    System.out.println(Arrays.toString(students));
    }


}

class StudentGPAComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
       return (o1.gpa + o1.name).compareTo(o2.gpa+o2.name);
    }
    
}

class Student implements Comparable<Student>
{

    private static int LAST_ID = 1;
    private static Random random = new Random();

    String name;
    int id;
    double gpa;
    

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);

    }


    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }


    @Override
    public int compareTo(Student o) {

        return Integer.valueOf(id).compareTo(o.id);
    }
    
}