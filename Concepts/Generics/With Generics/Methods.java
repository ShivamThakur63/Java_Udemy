public class Methods {

    public static void main(String[] args) {

        Integer[] a = { 2, 0, 0, 6 };
        Float[] b = { 2.0f, 0.6f, 2.0f, 6.3f };
        String[] c = { "21 Savage ", "Drake ", "Kendrik Lamar " };
        Character[] d = { 'M', 'e', 't', 'r', 'o', ' ', 'B', 'o', 'o', 'm', 'i', 'n' };

        System.out.println("--".repeat(15));
        System.out.println();
       
        getValue(a);
        getValue(b);
        getValue(c);
        getValue(d);



      


        System.out.println();


        System.out.println("First Element : "+getFirst(a));
        System.out.println("First Element : "+getFirst(b));
        System.out.println("First Element : "+getFirst(c));
        System.out.println("First Element : "+getFirst(d));


        System.out.println("Last Element : "+getLast(d));
        System.out.println("Middle Element : "+getMiddle(d));
        
        System.out.println("--".repeat(15));
        
    }


    // Generic Method 
    public static <Thing> void getValue(Thing[] x) 
    {

        for (Thing a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

    }


    public static <Thing> Thing getFirst(Thing[] x)
    {
        System.out.println();
        return x[0];
        
    }


    


    public static <Thing> Thing getLast(Thing[] x)  
    {
        System.out.println();
        return x[x.length-1];
        
    }



    public static <Thing> Thing getMiddle(Thing[] x)
    {

        for(Thing j : x )
        {

            if(x[x.length/2] == j )
            {
                return j;
            }
        
        }
        System.out.println();
        
        return null;
        
    }

}
