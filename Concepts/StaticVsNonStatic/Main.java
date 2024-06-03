package Concepts.StaticVsNonStatic;


/*
    Youtube 
    Channel : Coding with Josh 
    Link : https://www.youtube.com/watch?v=-Y67pdWHr9Y
 */

 
public class Main {
    
public static void main(String[] args) {

    System.out.println(Cat.getCatCount());
    Cat myCat = new Cat();
    myCat.name = "Stella";
    myCat.age = 4;
    myCat.meow();
    System.out.println(Cat.getCatCount());

    System.out.println(myCat.getCatCount());    // Discouraged to call static method with non static instances or object reference 

    Cat myCat1 = new Cat();
    myCat1.meow();
    System.out.println(Cat.getCatCount());


    System.out.println("Max Life : " + Cat.MAX_LIVES);


      // Comments on static vs non-static fields and methods
        // Cat.name = "George"; // Error: 'name' is not a static field
        // Cat.meow(); // Error: 'meow' is not a static method

        /*
         * Explanation:
         * - Static fields and methods belong to the class and are shared among all instances.
         * - Non-static fields and methods belong to individual instances of the class.
         * - Static methods cannot access non-static fields or methods directly.
         * - Non-static methods can access static fields and methods but doing so through instances is discouraged as it can be misleading.
         */


    /*
     *  Qusetion :  When to make something static field or non-static fields ?
     * 
        Answer = > Well if the method or field which you are creating only make sense only 
                   make sense for individual object or instance of that class or if it is has to be 
                   different for every object of that class then it will have to be non static but 
                   if it something more at the class level or something that should be same or a shared 
                   value among all of your class then it will probably make more sense to be more static .
     */

}


}