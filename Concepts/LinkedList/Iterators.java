package Concepts.LinkedList;

/*
Here's a brief overview of the methods defined in the Iterator interface:

    hasNext(): Returns true if the iteration has more elements.
    next(): Returns the next element in the iteration.
    remove(): Removes the last element returned by next() from the underlying 

    Because We cannot use remove method in for loop and iterator provides with a safe way to remove.
 */

import java.util.LinkedList;
import java.util.Iterator;

public class Iterators 
{
    public static void main(String[] args) {
        LinkedList<String> artist = new LinkedList<>();

        artist.add("Travis Scott");
        artist.add("Bhad Bhabie");
        artist.add("Lil Yatchy");
        artist.addFirst("Playboy Carti");
        artist.addLast("Yeat");
        artist.offer("Lil Baby");
        artist.push("Drake");


        System.out.println("-".repeat(49));
        System.out.println(artist);

        System.out.println("Artist at 3 index : "+ artist.get(3));
        System.out.println("First Index : "+artist.getFirst());
        System.out.println("Last Index : "+artist.getLast());
        testIterator1(artist);

    }
        // Iterators 
        /*
         * only uses .hasNext(),.next() & .remove()
         * Is forward only 
         * 
         */
        public static void testIterator(LinkedList<String> artist){
        var iterator = artist.iterator();
            while(iterator.hasNext()){
                // System.out.print(iterator.next()+" -> ");
                if(iterator.next().equals("Drake")){
                    iterator.remove();
                }
            }
            System.out.println(artist);

        }
        // List Iterators
        /*
         * can also move backward
         * also support add and set method
         */
        public static void testIterator1(LinkedList<String> artist){
            var iterator = artist.listIterator();
                while(iterator.hasNext()){
                    // System.out.print(iterator.next()+" -> ");
                    if(iterator.next().equals("Drake")){
                        // iterator.remove();
                        iterator.add("Central Cee");
                    }
                }
                // Will Not Work As we are already at the last so no element lasted
                while(iterator.hasNext()){
                    System.out.print(iterator.next()+" -> ");
                }
                System.out.println(artist);

                while(iterator.hasPrevious()){
                    System.out.print(iterator.previous()+" -> ");
                }

                var iterator2 = artist.listIterator(3);
                System.out.println(artist);
                System.out.println(iterator2.next());
                System.out.println(iterator2.previous());
    
        }

    
    
}
