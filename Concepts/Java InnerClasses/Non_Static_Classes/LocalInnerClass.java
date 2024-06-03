/*
  Local inner classes are defined inside a block, typically within a method, but they can also be inside loops or conditional statements. 
  They do not belong to any enclosing class and thus cannot have access modifiers. 
  They can be marked as final or abstract and have access to the fields of the enclosing class. 
  To invoke methods of a local inner class, you must instantiate it within the block where it's defined.


    Need : Local inner classes are particularly useful in scenarios where you need to encapsulate certain functionality 
           that is only relevant within a specific method or block of code.

 */



class Mobile 
{
    String name = "Nokia ";
    private static int modelNumber = 3310;
    final int rating = 10 ;


    public void mobileAssemble()
    {
        // static class Redmi
         class Redmi    // only abstract and final is permitted 
        {
            // private static int batteryCapacity = 400;
            public static int batteryCapacity = 400;
            // int batteryCapacity = 4000;
            void battery()
            {
                System.out.println(batteryCapacity+" mah Battery Capacity Very Good...");
            }
        } 



        class Iphone
        // Avoid using public access modifier for local inner classes cause it will not do shit as the scope of the class is limited within the method itself
        // public class InnerPublic {
        //     // Inner class members
        // }

        // Recommended: Use default (package-private) access modifier for local inner classes
        
        {
            void OS()
            {
                // System.out.println(Redmi.batteryCapacity+"OS Really Good...");    // is compiled when static 
                System.out.println("OS Really Good...");
            }
        }

        class Samsung
        {
            void display()
            {
                System.out.println(name+"'s Display Very Good...");
            }
        }

        class Pixel 
        {
            void photo()
            {
                System.out.println(name  + modelNumber + "'s Photo So Good...");
            }
        }

        Redmi redmi = new Redmi();
        redmi.battery();
        redmi.batteryCapacity =  900;
        System.out.println(redmi.batteryCapacity);

        Iphone iphone = new Iphone();
        iphone.OS();

        Samsung samsung = new Samsung();
        samsung.display();

        Pixel pixel = new Pixel();
        pixel.photo();
        // pixel.rating();



        System.out.println(Redmi.batteryCapacity);


        /*
          In the case of local inner classes, the access modifier doesn't affect the scope because their scope is limited to the enclosing block (e.g., a method). 
          So whether you use public, private, or the default (package-private) access modifier, the visibility remains the same within that block.

          However, adding access modifiers such as abstract, final, or static to local inner classes is allowed because it can affect their behavior 
          or usage, even if it doesn't directly impact their scope.
         */
    }

    void rating()
    {
        System.out.println("Rating for "+name+modelNumber+" = "+rating);
    }
    

}
public class LocalInnerClass 
{
    public static void main(String[] args) {
        
        Mobile mobile = new Mobile();
        mobile.mobileAssemble();
        mobile.rating();
        
    }
}
