package Concepts.CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Map;
/*
 * Keys are always unique
 * - put will override the value when we want to enter anything.
 * 
 * It is generally a HashMap and is not ordered 
 */
public class LearnMap 
{
    public static void main(String[] args) {
        
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        numbers.put("Two", 4);  // overrides the value for Two 

        // If we dont want to override something in case if there is already a value present in the key then we use check statement 
        if(!numbers.containsKey("Two"))
        {
            numbers.put("Two", 4);
        }

        System.out.println(numbers);


        // ifAbsent() -->  does the same work as this if statement but in one line.
        numbers.putIfAbsent("Two", 3);


        // Iterate through the Map --> we make an entry of Map 
        System.out.println("Iteration with Map : ");
        for(Map.Entry<String, Integer> e : numbers.entrySet())
            {
                // System.out.println(e);
                System.out.print(e.getKey()+ " :: ");
                System.out.println(e.getValue());
            }

        System.out.println("Keys Iteration :  ");
        for(String e : numbers.keySet())
        {
            System.out.println(e);
        }

        System.out.println("Values Iteration :  ");
        for(Integer e : numbers.values())
        {
            System.out.println(e);
        }


        // contains() -> returns t/f if any value is present in the list or not 
        System.out.println("Is Four Present as a key ? (t/f) :  "+ numbers.containsKey("Four"));
        System.out.println("Is Two  Present as a key ? (t/f) :  "+ numbers.containsKey("Two"));

        System.out.println("Is ( 5 ) as a value present in the Map (t/f) ? : "+ numbers.containsValue(5));
        System.out.println("Is ( 4 ) as a value present in the Map (t/f) ? : "+ numbers.containsValue(4));
    }
    
}
