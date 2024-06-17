package Concepts.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * hasNext() -> returns boolean if the list has element after that index
 * next() -> returns the next element 
 * remove() -> will remove the next element & only works while iterating
 * 
 * Simply Iterator doesnt care about the Stack i.e LIFO way it will always pull from the front i.e the ArrayList way
 * Important : *****
    ChatGPT
    In Java, an Iterator can indeed be used only once to traverse a collection. 
    Once an iterator has traversed all the elements, it is exhausted and cannot be reset or reused. 
    If you need to traverse the collection again, you must obtain a new iterator.

    Explanation:
    Single-Use Nature:
    Once you use an iterator to iterate through a collection, you cannot reset it or reuse it. 
    You need to create a new iterator to traverse the collection again.
    Comparison to Streams:
    Similar to iterators, Java Streams also cannot be reused. Once a terminal operation is 
    performed on a stream, it is consumed and cannot be reused.
 * 
 */

public class LearnIterator {
    public static void main(String[] args) {

        List<String> footballPlayers = new ArrayList<>(List.of(
                "Lionel Messi",
                "Cristiano Ronaldo",
                "Neymar Jr.",
                "Kylian Mbappe",
                "Robert Lewandowski",
                "Sergio Ramos",
                "Mohamed Salah",
                "Zlatan "));

        System.out.println("--".repeat(20));
        System.out.println(footballPlayers);

        Iterator<String> iterator = footballPlayers.iterator(); // iterator initialization

        System.out.println("Next Element : " + iterator.next()); // iterator index is at 0
        /*
         * The remove() method removes from the underlying collection the last element
         * returned by the iterator. This means that it deletes the element that was
         * most recently retrieved using next().
         * 
         * remove() can only be called once per call to next(). If you call remove() without 
         * first calling next(), or if you call remove() multiple times after a single call 
         * to next(), it will throw an IllegalStateException.
         */

        //  remove() method  -> removes the most latest element retrive using list from the original list 

         iterator.remove();
         System.out.println(footballPlayers);

        while (iterator.hasNext()) // it shifts to 1 and so on
        {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        System.out.println("--".repeat(20));

        // System.out.println("Next Element : "+iterator.next()); // iterator has reached
        // the last index & throws error

    }
}
