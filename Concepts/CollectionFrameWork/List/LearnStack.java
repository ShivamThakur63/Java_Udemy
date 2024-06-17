package Concepts.CollectionFrameWork.List;

import java.util.Iterator;
import java.util.Stack;


/*
 * Stack - Last In First Out 
 * Perfect Example of things inside the Bucket 
 * 
 * Important :
 * When you create an Iterator for a Stack, the Iterator maintains a 
 * snapshot of the Stack at the time it was created. If you modify the 
 * Stack after creating the Iterator (for example, by calling pop()), 
 * the Iterator may not be aware of these changes, leading to inconsistencies and unexpected behavior.
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


        // Using Iterator 
        Stack<String> comedian = new Stack<>();
        comedian.push("Rene Vaca");
        comedian.push("Gabriel Iglesias");
        comedian.push("Jimmy O Yang");
        comedian.push("Trevor Noah");

        System.out.println(comedian);
        System.out.println("Pop Value : "+comedian.pop());
        Iterator<String> iterator = comedian.iterator();
        System.out.println("Peek Value : "+ comedian.peek());
        // System.out.println("Pop Value : "+ comedian.pop());  // explained 1st - iterator snaps the value of the list and if there is change in anything it behaves wrongly.
        // iterator.remove();  // dont even use this instead 
        System.out.println("Iterator's next Element in Stack : " + iterator.next());
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");
        }



    }    
}
