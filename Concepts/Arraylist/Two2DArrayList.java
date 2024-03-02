import java.util.ArrayList;

public class Two2DArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> macDonalds = new ArrayList<>();
       
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coca Cola");
        drinks.add("Pepsi");
        drinks.add("Limca");
        drinks.add("Dr Pepper");


        ArrayList<String> snacks = new ArrayList<>();
        snacks.add("Big Mac");
        snacks.add("Crossiant");
        snacks.add("Happy Meal");
        snacks.add("French Fries");

        ArrayList<String> sides = new ArrayList<>();
        sides.add("Mozerrila ");
        sides.add("Pineapple Stick");
        sides.add("Sasuages");
        sides.add("Corn Dogs");


        macDonalds.add(drinks);
        macDonalds.add(snacks);
        macDonalds.add(sides);

        System.out.println("-".repeat(32));


        for(ArrayList<String> n:macDonalds){
            for(String idx : n ){
                int maxSize=30;
                int spaceleft=maxSize-idx.length();
                for(int i=0;i<spaceleft;i++){
                    idx+=" ";
                }
                System.out.print(idx+" ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(32));
        System.out.println(macDonalds);
        System.out.println("-".repeat(32));





     
    }
}
