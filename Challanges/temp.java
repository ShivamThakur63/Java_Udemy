import java.util.ArrayList;

public class temp {

 
    public static void main(String[] args) {

        int name[] = new int[4];
        name=new int[]{1,2,3,4,7,8};
        name[2]=8;
        name[3]=7;
        for(int i=0;i<name.length;i++){
        System.out.print(name[i]+" ");
        }
    
        System.out.println("\n"+"-".repeat(32));
        ArrayList<String> namesList = new ArrayList<>();

        //Adding Names 
        namesList.add("Shivam");
        namesList.add("Puskar");
        namesList.add("Bob");
        namesList.add("Eva");

        System.out.println("\n"+"-".repeat(32));
        System.out.println(namesList);
        
        System.out.println("Names in the ArrayList:");
    
        for (int i = 0; i < 4; i++) {
            System.out.print(namesList.get(i)+"  ");
        }
        System.out.println();
    }
}




        
  

