package Concepts.Java08.LamdaExpressions;



/*
    Question : Whats a lamda expression ?
    Answer = Lamda Expression is an anonymous function.
        i.e., 
            1) Not Having any name.
            2) Not having any return type.
            3) Not having modifiers 

    Steps to make any fuction lamda expression 
        1) Remove modifiers 
        2) Remove return type 
        3) Remove method name
        4) Place arrows 

       

    Characteristics :
        1) If body has just one statement then we can remove curly brackets.
        2) Use type interface, compiler guess the situation or context.
        3) No return keyword 


         Perfect example for this would be :

        1) No Return Statement Case : 

            previously

                private int getStringLength()
                {
                    return str.length();
                }

            converted to 

                String value = (String str ) -> {return str.length()}; 


            further converted to 


                (str) -> str.length()
             

        2) No Need to declare the datatype :

                previously 

                private void add(int a, int b )
                {
                    System.out.print( a + b );
                }


                converted to 

                    (int a, int b) -> {System.out.print( a + b );}

                    
                further converted to 

                    ( a,b )  ->  System.out.println( a + b );
            


        Benefits of lambda Expressions
            1) To enable functional programming in java.
            2) To make code more readable, maintainable and concise code.
            3) To enable parallel processing
            4) Jar file size reduction
            5) Elimination of shadow variable



 */





@FunctionalInterface
interface MyInterface
{
    void cry();

    default void sayByee()
    {
        System.out.println("Byee...");
    }

    public static void sayHello()
    {
        System.out.println("Hello...");
    }
}

interface MyInterfaceWithReturn
{
    String laugh();
}

interface MyInterfaceWithParameters
{
    String money(String name , int money);
}


public class Main 
{
    public static void main(String[] args) 
    {
        // MyInterface test = () -> {System.out.println("😭😭😭");}  ;      // single statement remove curly braces
        MyInterface test = () -> System.out.println("😭😭😭") ;  
        test.cry();

        // MyInterfaceWithReturn test2 = () ->{ return "😂😂😂";};
        MyInterfaceWithReturn test2 = () -> "😂😂😂";   // good practice 
        System.out.println(test2.laugh());

        // MyInterfaceWithParameters test3 = (String name , int money) -> name+" is worth "+ money+"💸💸";      // discouraged dont need no Datatype in parameter 
        MyInterfaceWithParameters test3 = ( name ,  money) -> name+" is worth "+ money+" billion dollar 💸💸";

        System.out.println(test3.money("Elon Musk", 210));


    }

   
    


    
    
}


    
    

