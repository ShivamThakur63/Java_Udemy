package Concepts.CollectionFrameWork.Set;

import java.util.LinkedHashSet;
import java.util.Set;
/*
    will inherit the property of both set & linked list
    - ordered collection  
 */
public class LearnLinkedHashet 
{
    public static void main(String[] args) 
    {
        Set<Integer> lhs = new LinkedHashSet<>();
        
        lhs.add(10); // ex Hashcode --> aisihxwh
        lhs.add(20); // ex Hashcode --> sniwiejxws
        lhs.add(30);
        lhs.add(40);
        lhs.add(40); // set only contains unique elements and will ignore this 

        System.out.println(lhs); // order doesn't matter and neither it is a ordered collection. So, it organizes items randomly. 

        lhs.remove(30);  // removes value 30 from the set 
        lhs.remove(00);  // does not throw exception if elements not found. 

        System.out.println(lhs);

        // contains function --> check if the desired value is present in the list or not 
        System.out.println(lhs.contains(100));
        System.out.println(lhs.contains(10));

        // isEmpty()  --> is set Empty or not 
        System.out.println(lhs.isEmpty());

        // size()  --> get the length of the set 
        System.out.println(lhs.size());

        // clear() --> empty the list 
        lhs.clear();
        System.out.println(lhs.isEmpty());
        System.out.println(lhs);
    
    }    
}
