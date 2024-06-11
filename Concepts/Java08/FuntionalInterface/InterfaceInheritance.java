package Concepts.Java08.FuntionalInterface;

// we can override the default method of interface 

/*
 Interview Question
 It will cause error as which sayHello() do you want to implement for this as it will be ambigious 
Solution : 
1) Change parameters or signature 
2) Override sayHello()

*/

public class InterfaceInheritance implements A, B {

    public static void main(String[] args) {

        Parent a = () -> System.out.println("You piece of shit...");
        a.anger();
        a.scold();
        Parent.guide();
        // Child.guide();

        Child b = () -> System.out.println("F you bitch...");
        b.anger();
        b.scold();
        // b.guide() // will not work cause guide is a static method of Parent and only
        // work with Parent

    }

    public void sayHello() {
        System.out.println("B says Hello !!");
    }

}

@FunctionalInterface
interface Parent {
    void anger();

    default void scold() {
        System.out.println("Wop Wop ....");
    }

    static void guide() {
        System.out.println("You are a complete failure...");
    }
}

@FunctionalInterface
interface Child extends Parent {
    // It has a hidden absract method of parent i.e anger()
    // we can also explicitly define it it doesnot even matter
    // void anger();

    // but if we try to create one more abstract method it will throw error and cry
    // void cry();

    // also cannot give implemetation to this as it is an abstract method and it is
    // an interface
    // void anger(){}

    // static void guide(){} // will not overide but will make another for child

    @Override
    default void scold() {
        System.out.println("I will leave this home...");
    }
}

interface A {

    default void sayHello() {
        System.out.println("A says Hello !!");
    }
}

interface B {

    default void sayHello() {
        System.out.println("B says Hello !!");
    }
}

/*
 * Static Method
 * 
 * Static Methods in Interface are those methods, which are defined in the
 * interface with the keyword static. Unlike other methods in Interface, these
 * static methods contain the complete definition of the function and since the
 * definition is complete and the method is static, therefore these methods
 * cannot be overridden or changed in the implementation class.
 * Similar to Default Method in Interface, the static method in an interface can
 * be defined in the interface, but cannot be overridden in Implementation
 * Classes. To use a static method, Interface name should be instantiated with
 * it, as it is a part of the Interface only.
 */

 interface D
 {
    public static void sayHello()
    {
        System.out.println("Hello from Interface");
    }

    // We can also add main method to the interface from java 8 nowonwards
    public static void main(String[] args) {
        System.out.println("Interface Says Hello from main Method ");
    }
 }

 class E implements D 
 {
    // @Override    // It's not a overridden method nether does the class have any relation with the interface SayHello Method bot of them are different and referred from their respective types  
    public static void sayHello()
    {
        System.out.println("Hello from Class");
    }

    public static void main(String[] args) {
        // Same same but differnet 
        D.sayHello();
        E.sayHello();
    }
 }