

public class Main {
    
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
}
