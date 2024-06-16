package Concepts.CollectionFrameWork.List;

import java.util.List;

import java.util.Iterator;

import java.util.ArrayList;

/*
 * Benefits of ArrayList 
 * - can be increased and decreased easily (not like tradition Arrays)
 * - provides with comparator interface 
 * - works with wrapper class 
 * 
 * Time Complexity 
 * middle element removal - all the other right will shift to right by one so the time complexity will be ( BigOn ) 
 * contains method - BigOn
 */
public class LearnArrayList 
{
    public static void main(String[] args) {

        // Traditional Array 
        /* 
        String [] studentsName = new String[2];
        studentsName[0] = "Rakesh";
        System.out.println(Arrays.toString(studentsName));
        studentsName[1] = "Harish";
        System.out.println(Arrays.toString(studentsName));

        // new student joined the chat 
        studentsName[2] = "Raman";
        System.out.println(Arrays.toString(studentsName));
        */


        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Rakesh");
        // Note : when we do this operation it increases its size this way i.e (size = n + n/2 + 1)

        /* At first if there is nothing present in the list it has zero values 
        attached to it then after we add something the size of it increases by 10 
        initially the ( 10 + (10 / 2 )= 5 + 1) = 16 sized arrays and also it 
        copies the old array to new array and dump the old array.
       */ 


       // Add Function --->> Always adds the element to the end of the list 
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);

        // Add element to the prefferred index --> Overloading of add method 
        list.add(2,100);    // will add 100 at 2nd index 
        System.out.println(list);

        // Add a list to another existing list 
        List<Integer> innerList = new ArrayList<>(List.of(10,20,30));
        list.addAll(2,innerList); // will add all the element of innerlist to this list starting from 2nd index
        System.out.println(list);


        // getter function  --> get desired element at specific index 
        System.out.println(list.get(6));


        // remove a specific element at any index or of any value 

        list.remove(5); // will remove the value at 5th index
        System.out.println(list);
        
        list.remove(Integer.valueOf(20));   // will remove first 30 value if its present anywhere in the list  
        System.out.println(list);

        // what if there is no any given value present in list 
        list.remove(Integer.valueOf(80));   // does nothing 
        System.out.println(list);


        // set function ->> sets th evalue of the particular index to something else 
        list.set(0, 0); // throws error if its an empty list obvious
        System.out.println(list);

        // contains function --> checks if there is any element with the respective value present in the list or not 
        System.out.println(list.contains(innerList));
        System.out.println(list.contains(10));


        // iterate through the arrayList
        System.out.println("Using Traditional For Loop : "); 
        for (int i = 0 ; i < list.size(); i++)
        {
            System.out.print(i+"  ");
        }

        System.out.println("\nUsing enhanced For Loop( For Each ) : ");

        for (int i : list)
        {
            System.out.print(i + "  ");
        }
        System.out.println();


        // Iterator --> is provided in every collection to iterate 
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) 
        {
            System.out.print(iterator.next()+"  ");
        }
        System.out.println();
        // clear function  -->> will remove every element in the list 
        list.clear();
        System.out.println(list);


        
    }

}
