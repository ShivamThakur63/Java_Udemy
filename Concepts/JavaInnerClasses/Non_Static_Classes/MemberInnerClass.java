package Concepts.JavaInnerClasses.Non_Static_Classes;


/*
 Features :
    1) These classes are tied to an instance of the outer class. 
    2) It can access all members of the outer class, including private members.
    3) A class created within another class but outside any method.
    4) It is also known as a regular inner class.
    5) It can be declared with access modifiers like public, default, private, and protected.
    6) The Java compiler creates a class file named Outer$Inner in this case. 
*/


class OuterClass {

        static private String name = "Travis Scott";
        static String city = "Houston, Texas";
        String wife = "Kyliee Jeneer";
        private int age = 19;


        OuterClass()
        {
            InnerClass inner = new InnerClass();
            inner.printNameAndCity();
            inner.printWifee();

            // Will cause infinite loop 
            // StaticInnerClass staticInnerClass = new StaticInnerClass();
            // staticInnerClass.printNameAndCityAndAge();
        }      


        public InnerClass getInnerClassInstance()
        {
            return new InnerClass();
        }

        private class InnerClass 
        {
            void printNameAndCity()
            {
                System.out.println("Name : "+name);
                System.out.println("City : "+city);
            }

            void printWifee()
            {
                System.out.println("Wifeee : "+wife);
            }
        }    
        
        
        
        // Static inner class definition
        static class StaticInnerClass {
            // Method to print name, city, and age
            void printNameAndCityAndAge() {
                OuterClass outer = new OuterClass();
                outer.new InnerClass().printNameAndCity();
    
                // Cannot access private instance variable 'age' directly
                // System.out.println("Age : " + age);
    
                // Accessing 'age' through an instance of OuterClass
                System.out.println("Age : " + outer.age);
    
                // Cannot access instance variable 'wife' directly
                // System.out.println(outer.wife);
    
                // Accessing 'wife' through an instance of OuterClass
                System.out.println(outer.wife);
    
                // Accessing static variable 'name' directly
                System.out.println(OuterClass.name);
            }
        }
    }
    


//  Ignore this Class and its methods 
public class MemberInnerClass 
{
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();

        staticClass.printNameAndCityAndAge();

        // Cannot be compiled because Scope is limited within OuterClass due to private access modifier
        // OuterClass.InnerClass innerClass = outer.new InnerClass();   

        
        
    }
}
