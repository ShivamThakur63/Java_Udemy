
package Concepts.ArrayList;
 
import java.util.ArrayList;
import java.util.Collections;


class Main01 {
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);


       //to get an element
       int element = list.get(0); // 0 is the index
       System.out.println(element);


       //add element in between
       list.add(1,2); // 1 is the index and 2 is the element to be added
       System.out.println(list);


       //set element
       list.set(0,0);
       System.out.println(list);


       //delete elements
       list.remove(0); // 0 is the index
       System.out.println(list);


       //size of list
       int size = list.size();
       System.out.println(size);


       //Loops on lists
       for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i) + " ");
       }
       System.out.println();


       //Sorting the list
       list.add(0);
       Collections.sort(list); // Will Use Built in Collections To Sort  
       System.out.println(list);
   }
}



    //Difference Between Normal Array And ArrayList 

    /*
     
     1) Declaration 
        In Array 
        => int Age[]=new int[];
        In ArrayList
        => ArrayList<Integer>age=new Arrraylist<String>();

     2) Initialization
        In Array 
        =>  stud[0]=s1;
            stud[1]=s2;
            stud[2]=s3;
            int[] oneDArray = {1, 2, 3, 4, 5};
            num[0][0]=new int[]{85,25,35,45};   
            

        In ArrayList 
        => age.add(20);
        => age.add(30);
        ArrayList<String> list3 = new ArrayList<>() {{
            add("Apple");
            add("Banana");
            add("Orange");
        }};
        => ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        => ArrayList<String> list5 = new ArrayList<>(List.of("Apple", "Banana", "Orange"));


     3) Printing 
        In Array 
        => For Loop 
        System.out.println("Array values: " + Arrays.toString(numbers));
        for(int i=0;i<name.length;i++){
        System.out.print(name[i]+" ");
        }

        In ArrayList 
        => Simply Calls Modified toString Method Of ArrayList So Need Of Looping
        System.out.print(namesList);
        Also Can Do Looping If We Want To 
         for (int i = 0; i < 4; i++) {
            System.out.print(namesList.get(i)+"  ");
        }

     2) Length Function 
        In Array => .length()
        In ArrayList =>.size()

     3) Get Function
        In Array 
        => System.out.println(name[0]);
        => for(int i=0;i<3;i++){
            System.out.println("Name :"+ stud[i].name +"\n"+"Age : "+stud[i].age+"\n"+"Address : "+ stud[i].address);
        }
        =>  for(Student m:stud){
            System.out.println("Name :"+ m.name +"\n"+"Age : "+m.age+"\n"+"Address : "+ m.address);
        }
        In ArrayList 
        => System.out.println(name.get(0));

    4) Set Function 
        In ArrayList
        => name[0]="Pizza";
        => name.set(index,Value)
        For Example : name.set(0," Pepperoni Pizza ");

    5) Remove Function 
        In Array 
        => We Simply Can't
        Why Not You Stupid Bastard 
        -Patrick Bateman 
        In ArrayList 
        => name.remove(index);

    6) Clear Method    //Clears All The Elements In An Array 
        In ArrayList 
        => name.clear();

     */

