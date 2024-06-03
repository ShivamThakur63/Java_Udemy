public class Methods {

    public static void main(String[] args) {

        Integer[] a = { 2, 0, 0, 6 };
        Float[] b = { 2.0f, 0.6f, 2.0f, 6.3f };
        String[] c = { "21 Savage ", "Drake ", "Kendrik Lamar " };
        Character[] d = { 'M', 'e', 't', 'r', 'o', ' ', 'B', 'o', 'o', 'm', 'i', 'n' };

        System.out.println("--".repeat(15));
       
        getValue(a);
        getValue(b);
        getValue(c);
        getValue(d);
        
        System.out.println("--".repeat(15));
        
    }


    // for Integer
    public static void getValue(Integer[] x) {

        for (Integer a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

    }

    // For Float
    public static void getValue(Float[] x) {
        for (Float a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();
    }

    // For String
    public static void getValue(String[] x) {

        for (String a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

    }

    // For Character
    public static void getValue(Character[] x) {
        for (Character a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
        
    }

}
