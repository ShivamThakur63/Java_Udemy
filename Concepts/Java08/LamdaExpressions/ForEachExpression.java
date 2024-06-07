package Concepts.Java08.LamdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ForEachExpression {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Travis Scott");
        list.add("Kanye West");
        
        list.add("Roddy Rich");
        list.add("Asap Rocky");

        list.add("Metro Bommin");
        list.add("Future");

        // For Single Statement 
        System.out.println("--".repeat(10));
        list.forEach((n) -> System.out.println(n));

        // For Multiple Statements 
        System.out.println("--".repeat(10));
        list.forEach((n)-> {
            System.out.print(n);
            System.out.println("   ||  Total Characters : "+n.length());
        });


        //  Using printf statement
         // For Multiple Statements 
         System.out.println("--".repeat(20));
         list.forEach((n)-> {
             int size = n.length();
             System.out.printf(" %-14s  ||  Total Characters : %02d %n",n,size);
         });







// <<< -----------------------  Nested For Each loop Lambda Expression   -------------------------->>>



        // Remember Arrays dont have a forEach method 
        MyInterfaceWithReturn test5  = () ->
        {
            String giggle = "🤭 🤭 🤭";
            String neutralFace = "😐    😐 😐";
            // "\\s+"  // -will ignore multiple whitespace 
            String[] giggleArray = giggle.split("\\s+");
            String[] neutralFaceArray = neutralFace.split("\\s+");

             // Convert arrays to ArrayLists
             ArrayList<String> giggleList = new ArrayList<>(Arrays.asList(giggleArray));
             ArrayList<String> neutralFaceList = new ArrayList<>(Arrays.asList(neutralFaceArray));
 


            giggleList.forEach((n) ->{
            neutralFaceList.forEach((m) -> {
            String final6 = n+m;

                System.out.print(final6);
            });
            System.out.println();
        });

        System.out.println((neutralFaceList));
        System.out.println(Arrays.toString(neutralFaceArray));

            return giggle+neutralFace;
        };

        System.out.println(test5.laugh());
        
    
    }
    
}
