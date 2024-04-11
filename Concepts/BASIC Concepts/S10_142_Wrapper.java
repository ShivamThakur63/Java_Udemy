import java.util.ArrayList;
import java.util.Arrays;

public class S10_142_Wrapper {

    public static void main(String[] args) {
     
     // wrapper class =  provides a way to use primitive data types as reference data types
     //     reference data types contain useful methods
     //     can be used with collections (ex.ArrayList)
     
     //primitive  //wrapper
     //---------  //-------
     // boolean  Boolean
     // char   Character
     // int   Integer
     // double  Double
     
     // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
     // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

     // why not wrapper 
     //     wrapper objects are slow and collected in heap memory 
     //     allows primitive types to behave as objects 
     //     provides additional utility method like Integer.parseInt(str); and many other 


     // How Boxing is Done 
     
     Integer a = Integer.valueOf(20);       // pereferred But Unnecessary 
     Integer b = new Integer(20);       // Deprecated Since Java 9

      // How Unboxing is Done 
     
      Integer c = 20;
      int d = c;        // Auto unboxng and preferred way 
      int e = c.intValue(); // Manual Unboxing but unnecessary 

      Character[] f = {'a','b','c','d','e'};
      System.out.println(Arrays.toString(f));
     
    // Autoboxing: primitive int to Integer
    Integer intValue = 100;

    // Autoboxing: primitive double to Double
    Double doubleValue = 3.14;

    // Autoboxing: primitive boolean to Boolean
    Boolean boolValue = true;

    // Unboxing: Integer to primitive int
    int intValueUnboxed = intValue;

    // Unboxing: Double to primitive double
    double doubleValueUnboxed = doubleValue;

    // Unboxing: Boolean to primitive boolean
    boolean boolValueUnboxed = boolValue;

    System.out.println("Autoboxing and Unboxing Example:");
    System.out.println("Integer value: " + intValue);
    System.out.println("Double value: " + doubleValue);
    System.out.println("Boolean value: " + boolValue);
    System.out.println("Unboxed Integer value: " + intValueUnboxed);
    System.out.println("Unboxed Double value: " + doubleValueUnboxed);
    System.out.println("Unboxed Boolean value: " + boolValueUnboxed);
     
    System.out.println("-".repeat(32));
    var array = getArray(2,3,41,3,45,6,7,8,9,10);
    System.out.println(array);
    }
    
    // AutoUnboxing best Example
    public static Integer getIntLiteralPrimitiveValue(){
        return Integer.valueOf(20);
      }

      public static int getIntValue(Integer i ){
        return i;
      }

      public static Integer getIntegerValue(int i ){
        return i;
      }

      // in arraylist 
      public static ArrayList<Integer> getArray(int... varargs){
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i :varargs){        // replace int with Integer n change 
            alist.add(i);
        }
        return alist;
      }
   }

