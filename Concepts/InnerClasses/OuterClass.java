package Concepts.InnerClasses;

public class OuterClass 
{
    int number = 6;
    public void heyThere()
    {
        System.out.println("Hey There From Outer Class ");


        class LocalInnerClass
        {
            String LocalInnerClassVariable = "Here's Jonny";
            public void printlicv()
            {
                System.out.println("LocalInnerClassVariable : "+LocalInnerClassVariable);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printlicv();
    }    

    // Non Static Inner Class 

    // public class InnerClass 
    // {
    //     int innerNumber = 8 ;

    //     public void whatsUp()
    //     {
    //         System.out.println("What's up from Inner Class");
    //     }
    // }


    public static class InnerClass 
    {
        int innerNumber = 8 ;

        public void whatsUp()
        {
            System.out.println("What's up from Inner Class");
        }
    }

}
