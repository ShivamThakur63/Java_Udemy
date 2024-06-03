package Concepts.InnerClasses;
import java.util.ArrayList;
import java.util.List;

public class Main 
{

    public static void main(String[] args) {
       
        OuterClass outer = new OuterClass();
        outer.heyThere();
        // OuterClass.heyThere();   

        // InnerClass inner = new InnerClasses();

        // Integer num  = outer.number;
        // Non-Static Inner Class 
        // OuterClass.InnerClass inner = outer.new InnerClass();
        // inner.whatsUp();    

        OuterClass.InnerClass inner = new OuterClass.InnerClass();

        inner.whatsUp();



    }
}