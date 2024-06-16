package Concepts.CollectionFrameWork.List;

import java.util.Stack;

/*
 * Stack - Last In First Out 
 * Perfect Example of things inside the Bucket 
 */
public class LearnStack 
{
    public static void main(String[] args) 
    {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack : "+animals);

        System.out.println(animals.peek()); // will dispaly the last object added to the stack (LIFO)

        System.out.println(animals.pop());  // will remove and return the first element within the list 

        System.out.println(animals);


    }    
}
