package Concepts.CollectionFrameWork.List;

import java.util.List;
import java.util.Vector;
/*
 * ⚡ Quick summary. Synchronous means happening at the same time. 
 *   Asynchronous is the opposite—not happening at the same time.
 * 
 * Vector was released first (Java 1.1)
 * ArrayList was released then after (Java 1.2)
 * 
 * Important : Since Both are implementation of the List which one should we prefer :
 * Points :
 *  1) Vector is synchronized (thread-safe) but slower in single-threaded scenarios.
 *     ArrayList is not synchronized (not thread-safe) but faster in single-threaded scenarios.
 *  2) Vector increases its size by 100 % and ArrayList by (n/2 + 1) i.e 50 %
 *  3) Vectors are ThreadSafe but ArrayList is not thats why arraylist is fast 
 * 
 * To the Point, Arraylist wins the chat 
 * When to work with vector ?
 * When it is specially asked to work with vector then only wok with vector else not Always use ArrayList
 */
public class LearnVector 
{
    public static void main(String[] args) 
    {
        Vector<Integer> number = new Vector<>();
        
        // since vector is defined after List interface it has some list feature
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        List<Integer> innerOne = new Vector<>(List.of(6,7,8,9,10));
        number.addAll(innerOne);

        System.out.println(number);

        // capacity() --> it returns the capacity of the Vector 

        System.out.println("Capacity After 10th element : "+number.capacity());

        number.add(11);

        System.out.println("Capacity After 11th element : "+number.capacity());

        List<Integer> innerSecond = new Vector<>(List.of(12,13,14,15,16,17,18,19,20));
        number.addAll(innerSecond);

        System.out.println("Capacity After 20th element : "+number.capacity());

        number.add(21);

        System.out.println("Capacity After 21th element : "+number.capacity());

        List<Integer> innerThird = new Vector<>(List.of(22,23,24,25,26,27,28,29,30));
        number.addAll(innerThird);

        System.out.println("Capacity After 30th element : "+number.capacity());

        number.add(31);

        System.out.println("Capacity After 31th element : "+number.capacity());

        List<Integer> innerFourth = new Vector<>(List.of(32,33,34,35,36,37,38,39,40));
        number.addAll(innerFourth);

        System.out.println("Capacity After 40th element : "+number.capacity());

        number.add(41);

        System.out.println("Capacity After 41th element : "+number.capacity());

        System.out.println(number);



    }    
}
