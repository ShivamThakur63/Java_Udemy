import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class S10_135_ArrayListChallange {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        ArrayList<String> groceryList = new ArrayList<>(List.of("apple", "grape","banana", "carrot", "eggplant"));

        boolean flag = true ;

        while(flag){
            printText();
        switch(Integer.parseInt(sc.nextLine())){
            case 0 -> { 
            System.out.println("Shutting Down.");        
            flag = false;
        }
            case 1 -> addItems(groceryList);
            case 2 -> removeItem(groceryList);
            default ->  flag = false;
          
        }
    }
        System.out.println("-".repeat(32));
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Array List After : " + groceryList);

    }

    public static void printText()
    {
        String textField =  """
            Available Action :
            0 - shutdown
            1 - to add any item to the List (comma delimated List)
            2 - to remove any item from the List (comma delimated List)
            Enter The Number For The Action to be Performed : """;

            System.out.println(textField+" ");
    }
    public static void addItems(ArrayList<String>groceryList)
    {
        System.out.print("Enter groceryitem to Add (Seperate With Comma's) : ");
        String[] subinput = sc.nextLine().split(",");
        // groceryList.addAll(List.of(subinput));

        for(String i : subinput)
        {
            if(groceryList.indexOf(i)<0)
            {
                String trimmed = i.trim();
                groceryList.add(trimmed);
            }
        }
    }

        // Remove Item 
        public static void removeItem(ArrayList<String> groceryList)
    {
        System.out.print("Enter groceryitem to Remove (Seperate With Comma's) : ");
        String[] subinput = sc.nextLine().split(",");
        groceryList.removeAll(List.of(subinput));

        for(String i : subinput)
        {
                String trimmed = i.trim();
                groceryList.remove(trimmed);
        }
        

    }
}
