package Concepts.CollectionFrameWork.Map;

import java.util.Map;
import java.util.TreeMap;
/*
 * Is the same as Hashmap but it sorts the number based on the keys 
 */

public class LearnTreeMap 
{
    public static void main(String[] args) 
    {
        
        Map<String,Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.put("Two", 4);  // overrides the value for Two 

        // If we dont want to override something in case if there is already a value present in the key then we use check statement 
        if(!numbers.containsKey("Two"))
        {
            numbers.put("Two", 4);
        }

        System.out.println(numbers);

        numbers.remove("One");  // removes key one along with its value from Map 
        System.out.println(numbers);
        numbers.remove("ONE");  // doesnt not throws error
        System.out.println(numbers);


        // Performs the Same as the HashMap 

        // // ifAbsent() -->  does the same work as this if statement but in one line.
        // numbers.putIfAbsent("Two", 3);


        // // Iterate through the Map --> we make an entry of Map 
        // System.out.println("Iteration with Map : ");
        // for(Map.Entry<String, Integer> e : numbers.entrySet())
        //     {
        //         // System.out.println(e);
        //         System.out.print(e.getKey()+ " :: ");
        //         System.out.println(e.getValue());
        //     }

        // System.out.println("Keys Iteration :  ");
        // for(String e : numbers.keySet())
        // {
        //     System.out.println(e);
        // }

        // System.out.println("Values Iteration :  ");
        // for(Integer e : numbers.values())
        // {
        //     System.out.println(e);
        // }


        // // contains() -> returns t/f if any value is present in the list or not 
        // System.out.println("Is Four Present as a key ? (t/f) :  "+ numbers.containsKey("Four"));
        // System.out.println("Is Two  Present as a key ? (t/f) :  "+ numbers.containsKey("Two"));

        // System.out.println("Is ( 5 ) as a value present in the Map (t/f) ? : "+ numbers.containsValue(5));
        // System.out.println("Is ( 4 ) as a value present in the Map (t/f) ? : "+ numbers.containsValue(4));
    
    }    
}
