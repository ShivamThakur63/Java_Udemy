
import java.util.*;
public class Three3DArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<ArrayList<String>>>Species = new ArrayList<>();
        String category [] = {"Bird","Mammals ","Aquatic "}; 

        ArrayList<ArrayList<String>> Bird = new ArrayList<>();
        ArrayList<String> bird1= new ArrayList<>(Arrays.asList("Penguin","Red Billed","Parrot","Sparrow"));
        ArrayList<String> bird2= new ArrayList<>(Arrays.asList("Danfe","Pigeon","Crane","Sparrow"));
        ArrayList<String> bird3= new ArrayList<>(Arrays.asList("American Parrot","Owl","Flamingos","DODO"));
        Bird.add(bird1);
        Bird.add(bird2);
        Bird.add(bird3);

        ArrayList<ArrayList<String>> Mammal = new ArrayList<>();
        ArrayList<String> mammal1= new ArrayList<>(Arrays.asList("Elephant ","Cat","Dog","Camel","Dolphin"));
        ArrayList<String> mammal2= new ArrayList<>(Arrays.asList("Giraffe ","Cat","OX","Camel","Dolphin"));
        ArrayList<String> mammal3= new ArrayList<>(Arrays.asList("Cow","Cat","Goat " ,"Dog","Camel","Bufallo"));
        Mammal.add(mammal1);
        Mammal.add(mammal2);
        Mammal.add(mammal3);

        ArrayList<ArrayList<String>> Aquatic = new ArrayList<>();
        ArrayList<String> aquatic1= new ArrayList<>(Arrays.asList("Sail","Sea Lion","Whale","Shark","Sea Cucumber","Groupers"));
        ArrayList<String> aquatic2= new ArrayList<>(Arrays.asList("Lion Fish","Sea Lion","Whale","Shark","Sea Cucumber","Orcas"));
        ArrayList<String> aquatic3= new ArrayList<>(Arrays.asList("Oyestors","Whale","Shark","Sea Cucumber","Puffer Fish"));
        Aquatic.add(aquatic1);
        Aquatic.add(aquatic2);
        Aquatic.add(aquatic3);


        Species.add(Bird);
        Species.add(Mammal);
        Species.add(Aquatic);


        System.out.println(Species);

        System.out.println("_".repeat(32));
        System.out.println();

        //For Each Loop 
        
        int categoryIndex = 0;
        for(ArrayList<ArrayList<String>> n :Species){
            System.out.println(category[categoryIndex++]);  //Increases Value After the Current Value Is Used 
            for(ArrayList<String> m : n){
                for(String o :m ){
                    int maxlength = 20;
                    int spaceleft = maxlength-o.length();
                    for(int i = 0 ; i < spaceleft;i++){
                        o+=" ";
                    }
                    System.out.print(o+" ");
                }
            
                System.out.println();
            }
            
            System.out.println("\n");
        }
    
}
}

