package Concepts.CollectionFrameWork.Set;

import java.util.HashSet;
/*
 * Its like a smart so when you try to put something in it and take out it doesnt 
 * care but if you try to put the same ball two ties it throws out that ball. 
 * 
 * when you try to take out one one ball it will be choosen randomly whichever comes first 
 * i.e because the set makes out the hash of all the all the element within the list internally 
 * and the unique hash is put in the set rather than the actual value and it refers to the actual value  
 * and will check if the hashvalue of any element matches to another it doesnot add element to the list 
 */

public class LearnHashSet 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10); // ex Hashcode --> aisihxwh
        hs.add(20); // ex Hashcode --> sniwiejxws
        hs.add(30);
        hs.add(40);
        hs.add(40); // set only contains unique elements and will ignore this 

        System.out.println(hs); // order doesn't matter and neither it is a ordered collection. So, it organizes items randomly. 

        hs.remove(30);  // removes value 30 from the set 
        hs.remove(00);  // does not throw exception if elements not found. 

        System.out.println(hs);

        // contains function --> check if the desired value is present in the list or not 
        System.out.println(hs.contains(100));
        System.out.println(hs.contains(10));

        // isEmpty()  --> is set Empty or not 
        System.out.println(hs.isEmpty());

        // size()  --> get the length of the set 
        System.out.println(hs.size());

        // clear() --> empty the list 
        hs.clear();
        System.out.println(hs.isEmpty());
        System.out.println(hs);
    }    
}
