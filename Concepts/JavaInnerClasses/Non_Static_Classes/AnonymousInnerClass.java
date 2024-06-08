package Concepts.JavaInnerClasses.Non_Static_Classes;


/*
 
    Java anonymous inner class is an inner class without a name and for which only a single object is created.
    An anonymous inner class can be useful when making an instance of an object with certain "extras" such as 
    overloading methods of a class or interface, without having to actually subclass a class.

    Need : 
    
    In summary, anonymous classes are useful for creating short, specific implementations that won't be reused, 
    reducing the overhead of creating a named class. They are particularly common in event handling, thread creation, 
    implementing small interface instances, and overriding methods for one-time use.

    In simple words, a class that has no name is known as an anonymous inner class in Java. 
    It should be used if you have to override a method of class or interface. 
    
    Java Anonymous inner class can be created in two ways:

    1) Class (may be abstract or concrete).
    2) Interface
 */



 abstract class Car 
 {
    abstract void drive();

    void brake()
    {
        System.out.println("Brakin...");
    }
 }


 interface Drivable 
{
    abstract void engineOn();
    abstract void drive();

    default void accelerate()
    {
        System.out.println("Acceleratin...");
    }
}

//  Ignore this Class it only contains main method 
 public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        Car BMW = new Car()

        {

            @Override
            void drive() {
                System.out.println("BMW Drivin...");
            }
            
        };

        BMW.brake();
        BMW.drive();
        


        Car mercedes = new Car(){
            void brake() {
                System.out.println("Mercedes Brakin...");
            }

            void drive() {
                System.out.println("Mercedes Drivin...");
            }
        };


        mercedes.brake();

        /*
          A class is created, but its name is decided by the compiler, which extends the Person class and provides the implementation of the eat() method.
          An object of the Anonymous class is created that is referred to by 'p,' a reference variable of Person type.
         */




         Drivable Ford = new Drivable()
         {

            @Override
            public void engineOn() {
                System.out.println("Turning Ford Engine On...");
            }

            @Override
            public void drive() {
                System.out.println("Drivin...");
            }

            public void accelerate()
            {
                System.out.println("Accelerating Ford..");
            }

         };

         Ford.accelerate();
         Ford.engineOn();

         /*
          In Java, you cannot create a class that both extends a class and implements an interface directly using an anonymous class. 
          Anonymous classes can either extend one class or implement one interface, but not both simultaneously.


          */


          Man binayak = new Man();
          binayak.fart();
          binayak.snoring();

    }

}




//  Some Confusions Nothing else ....

interface Farting
{
    void fart();
    default void snoring()
    {
        System.out.println("Snorin..");
    }

}

abstract class People 
{
    abstract void fart();
    abstract void snoring();
    
}
class Man extends People implements Farting
{

    @Override
    public void fart() {
       System.out.println("Man Fartin...");
    }

   /*
        Compilation Error : Because the default access modifier is public in case of interface 
        and this class also implements the interface but if we comment that out in the interface 
        it works as fine as a red wife and is compiled easily like the one below.
    */
    // void snoring()
    // {
    //     System.out.println("Man Snorin...");
    // }

    public void snoring()
    {
        System.out.println("Man Snorin...");
    }

}