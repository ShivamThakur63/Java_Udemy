package Concepts.CollectionFrameWork.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


/*
 * Suppose we have Barak Obama waiting for his chicken nuggets order in Mcdonalds drive thru 
 * and also biden at the window to get his Mcflurry but we cannot let our Ex Preseident waiting
 * in line so we will give him his chicken nugget first then we will proceed to ordinary people like biden. 
 * 
 * Order doesnt matter.
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

        // For Student

        Student e5 = new Student("50 Cent", 2);
        Student e7 = new Student("Akon", 3);
        Student e8 = new Student("50 Cent", 4);
        Student e6 = new Student("Eminem", 1);
        Student e11 = new Student("Sean Kington", 1);

        Queue<Student> studentSet = new PriorityQueue<>();
        studentSet.add(e5);
        studentSet.add(e6);
        studentSet.add(e7);
        studentSet.add(e8);
        studentSet.add(e11);

        System.out.println(studentSet);

        // For Employee without Overriding the Hashcode and .equals() method

        Employee e1 = new Employee("50 Cent", 2);
        Employee e2 = new Employee("Eminem", 1);
        Employee e4 = new Employee("Jon Lajoie", 4);
        Employee e10 = new Employee("Jon Lajoie", 1);
        Employee e3 = new Employee("Akon", 3);
        

        Queue<Employee> employeeSet = new PriorityQueue<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e10);

        System.out.println(employeeSet);


        
    }
}
