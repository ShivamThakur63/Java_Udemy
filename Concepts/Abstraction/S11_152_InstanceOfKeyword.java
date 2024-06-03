package Concepts.Abstraction;

class Bird 
{
    public void sing()
    {
        System.out.println("Bird Singin!");
    }
    public void shit()
    {
        System.out.println("Bird Shitting.");
    }
}

interface Aves
{
    public void fly();
    public void peaking();
}
class Eagle extends Bird
{
    @Override
    public void sing()
    {
        System.out.println("Eagle singin!");
    }

    public void shit()
    {
        System.out.println("Eagle Shitting.");
    }
}

class GoldenEagle extends Eagle
{

}
class Woodpeaker implements Aves
{

    @Override
    public void fly() {
        System.out.println("Flying across Oceans. ");
    }

    @Override
    public void peaking() 
    {
        System.out.println("Wood Peaker Peaking in Trees.");
    }

}

public class S11_152_InstanceOfKeyword 
{
    public static void main(String[] args) 
    {
        Eagle a = new Eagle();
        Woodpeaker b = new Woodpeaker();
        Eagle c = new Eagle();
        GoldenEagle d = new GoldenEagle();
        GoldenEagle e = null;
        System.out.println("Check For Class         : "+ (a instanceof Bird));
        System.out.println("Check For Interface     : " + (b instanceof Aves));
        System.out.println("Check For Own Class     : " + (c instanceof Eagle));
        System.out.println("Check For Parent Class  : " + (d instanceof Eagle));
        System.out.println("Check For Child Class   : " + (c instanceof GoldenEagle));
        System.out.println("Check For Null Value    : " + (e instanceof GoldenEagle));


        // Try using refernce variable with it
        if(a instanceof Bird pigeon){
        pigeon.sing();
        pigeon.shit();
        }
        c.shit();
    }

}


/*
  Note : 
  1) Always Check For The Right Side 
  2) if left side is either 
        - class
        - sub class
        - interface 
  3) Returns True 
  4) If You Try To Assign Variable 
     it will create one with type on Right 
     side with object of the left side
 */