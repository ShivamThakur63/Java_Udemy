package Concepts.LinkedList;

/*
Stack:  A stack is a data structure that follows the Last In, First Out (LIFO) principle, 
        meaning that the last element added to the stack is the first one to be removed. 
        You can visualize a stack as a stack of plates, where you can only add or remove 
        plates from the top.

    Stack Functons :
        push(element)       : Adds an element to the top of the stack.
        pop()               : Removes and returns the top element from the stack.
        peek()              : Returns the top element of the stack without removing it.
        isEmpty()           : Checks if the stack is empty.
        size()              : Returns the number of elements in the stack.
        addFirst(element)   : Adds an element to the top of the stack (alternative to push).
        addLast(element)    : Adds an element to the bottom of the stack.
        removeFirst()       : Removes and returns the top element from the stack (alternative to pop).
        removeLast()        : Removes and returns the bottom element from the stack.


Queue:  A queue is a data structure that follows the First In, First Out (FIFO) principle, 
        meaning that the first element added to the queue is the first one to be removed. 
        You can visualize a queue as a line of people waiting for a service, where the 
        first person in line is served first.

    Queue Functions :
        enqueue(element)    : Adds an element to the end of the queue.
        dequeue()           : Removes and returns the front element from the queue.
        peek()              : Returns the front element of the queue without removing it.
        isEmpty()           : Checks if the queue is empty.
        size()              : Returns the number of elements in the queue.
        addFirst(element)   : Adds an element to the front of the queue.
        addLast(element)    : Adds an element to the end of the queue (alternative to enqueue).
        removeFirst()       : Removes and returns the front element from the queue (alternative to dequeue).
        removeLast()        : Removes and returns the end element from the queue.


 */

import java.util.LinkedList;
import java.util.ListIterator;

public class StackVQuence {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        // removeElements(placesToVisit);
        // System.out.println(placesToVisit);

        // gettingElements(placesToVisit);
        printItinerary3(placesToVisit);
        

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");

    }



    // Now Its Time For Retrival Of Elements In an ArrayList

    public static void gettingElements(LinkedList<String> list){
        System.out.println("Retrived Element : "+list.get(4));
        System.out.println("Last Element : "+list.getLast());
        System.out.println("First Element : "+list.getFirst());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position : "+list.lastIndexOf("Melbourne"));

        // Queue Retrival Method
        System.out.println("Element From element() :"+list.element());
        // Stack Retrival Methods 
        System.out.println("Element from peek() : "+list.peek());
        System.out.println("Element from peekFirst() : "+list.peekFirst());
        System.out.println("Element from peekLast() : "+list.peekLast());

    }

        // Itinerary Method 
        public static void printItinerary(LinkedList<String> list){
            System.out.println("Trip starts at "+list.getFirst());
            for(int i = 0 ;i<list.size()-1;i++){
                System.out.println("--> From "+list.get(i)+" To "+list.get(i+1));
            }
            System.out.println("Trip ends at "+list.getLast());


        }

        public static void printItinerary2(LinkedList<String> list){
            System.out.println("Trip starts at "+list.getFirst());
            String previousTown = list.getFirst();
            for(String town : list ){
                System.out.println("--> From "+previousTown+" To "+town);
                previousTown = town;
            }
            System.out.println("Trip ends at "+list.getLast());


        }

        public static void printItinerary3(LinkedList<String> list){
            System.out.println("Trip starts at "+list.getFirst());
            String previousTown = list.getFirst();
            ListIterator<String> iterator = list.listIterator(1);
            while(iterator.hasNext()){
                var town = iterator.next();
                System.out.println("--> From "+previousTown+" To "+town);
                previousTown = town;
            }
            System.out.println("Trip ends at "+list.getLast());


        }

    
}

