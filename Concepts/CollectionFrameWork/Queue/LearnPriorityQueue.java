package Concepts.CollectionFrameWork.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Suppose we have Barak Obama waiting for his chicken nuggets order in Mcdonalds drive thru 
 * and also biden at the window to get his Mcflurry but we cannot let our Ex Preseident waiting
 * in line so we will give him his chicken nugget first then we will proceed to ordinary people like biden. 
 * 
 * This gives priority to the smallest number or string within the Queue(minHeap)
 * It does by 
 */
public class LearnPriorityQueue {
    public static void main(String[] args) 
    {
        // Queue<Integer> pq = new PriorityQueue<>();      // by default uses minHeap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());      // we can reverse it by passing Comparator to the parameter(maxHeap)

        pq.offer(10);
        pq.offer(30);
        pq.offer(05);   // will arrange it in top using minheap 
        pq.offer(20);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

        
    }
}
