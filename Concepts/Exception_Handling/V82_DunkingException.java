// package Exception_Handling;
/*
  Dunking In Java :
  In Java, when you use the throws keyword in a method declaration, you're essentially indicating that 
  the method might throw certain types of exceptions, but you're not handling those exceptions within the method itself. 
  Instead, the responsibility for handling these exceptions is passed to the caller of the method.
 */

 
 // First And The Better Way 

class A
{
    public void show()
    {
        try
        {
            Class.forName("Demo");
            Class.forName("V81_CustomException");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class Failed To Load ");
        }
    }
}
public class V82_DunkingException 
{

    static 
    {
        System.out.println("Program Loaded !!");
    }
    public static void main(String[] args) 
    {
        A ex = new A();
        ex.show();
    }
}

// Second way And Slightly Worse 
/*
class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");
        // Class.forName("V81_CustomException");
        
    }
}
public class V82_DunkingException 
{

    static 
    {
        System.out.println("Program Loaded !!");
    }
    public static void main(String[] args) 
    {
        try
        {
            A ex = new A();
            ex.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class Failed To Load ");
        }
    }
}

*/

// Third And Completely Fucked Way : Will Ask JVM to Fix This Himself
/*
 class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");
        // Class.forName("V81_CustomException");
        
    }
}
public class V82_DunkingException 
{

    static 
    {
        System.out.println("Program Loaded !!");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        A ex = new A();
        ex.show();
       
    }
}

 */