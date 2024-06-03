import java.util.ArrayList;
import java.util.HashMap;

public class Main 
{
 
    public static void main(String[] args) {
        
    //  Single Generic Class 
    GenericClass<Integer> a = new GenericClass<>(1);
    GenericClass<Character> b = new GenericClass<>('@');
    GenericClass<Float> c = new GenericClass<>(2.063f);
    GenericClass<String> d = new GenericClass<>("Playboy Carti");

    ArrayList<String> friends = new ArrayList<>();


    System.out.println(a.getValue());
    System.out.println(b.getValue());
    System.out.println(c.getValue());
    System.out.println(d.getValue());

    System.out.println(a.getValue()+c.getValue());


    // Dual Generic Class with boundaries
    MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
    MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);   
    MyGenericClass<Double,String> abc = new MyGenericClass<>(3.14,"Drake");   

    // MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
    // MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');
   
    System.out.println("-".repeat(10));
    System.out.println(myInt.getValue());
    System.out.println(abc.getValue());
    System.out.println(myDouble.getValue());

    // System.out.println(myChar.getValue());
    // System.out.println(myString.getValue());



    HashMap<Integer,String> capital = new HashMap<>();
    


    }

}
