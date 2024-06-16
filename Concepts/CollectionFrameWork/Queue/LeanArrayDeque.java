package Concepts.CollectionFrameWork.Queue;

import java.util.ArrayDeque;

/*
 * This queue help us to take and also put out element from both top and button side
 */
public class LeanArrayDeque 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        
        adq.offer(23);  // from Queue 
        adq.offerLast(12);  // from ArrayDeque
        adq.offerFirst(20);  // from ArrayDeque
        adq.offer(30);  

        System.out.println(adq);

        System.out.println("--".repeat(10));
        
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("--".repeat(10));

        System.out.println(adq.poll());
        System.out.println("poll() "+adq );


        System.out.println(adq.pollFirst());
        System.out.println("poll() "+adq );


        System.out.println(adq.pollLast());
        System.out.println("poll() "+adq );
    }    
}
