package Concepts.Java08.FuntionalInterface;


 /*
    Funtional Interface 
    Defn : Interface having exactly having one abstract method but can have as many default and static method.
           We can invoke lambda expression by using functional interface.

    @FunctionalInterface
    What is the advantages of this annotation ?
        1) It restricts the interface to be functional interface 
        2) So if people have already used some lambda expression and some new 
        team menber added another abstract method in the interface 
        all lambda expressions will have errors.
  */

//   when we implement an interface we need to compulsourly override the method and when we dont want to do that we need to crete an annonymous class
  public class Main implements Yapping {

    @Override
    public void yap() {
        System.out.println("Overridden Yapping");
    }

    public static void main(String[] args) {
        // Using a lambda expression
        Yapping yapLambda = () -> System.out.println("Yapping from lambda");
        yapLambda.yap();

        // Using an anonymous inner class
        Yapping yapInnerClass = new Yapping() {
            @Override
            public void yap() {
                System.out.println("Yapping from anonymous inner class");
            }
        };
        yapInnerClass.yap();

        // Using a class that implements the interface
        Main main = new Main();
        main.yap();
        main.party();

        // Calling the static method
        Yapping.talk();
    }
}

  

// Will restrict to only add one abstract method after this annotation 
// either comment this out to add more abstract method or comment the method to satisfy this annotation
@FunctionalInterface      
interface Yapping
{
    void yap();
    // void rap();

    static void talk ()
    {
        System.out.println("You know what I'm saying...");
    }

    default void party()
    {
        System.out.println("Its dope homie...");
    }

}