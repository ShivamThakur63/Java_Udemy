class Bird 
{
    public void sing()
    {
        System.out.println("Bird Singin!");
    }
}

interface Aves
{
    public void fly();
    public void peaking();
}
class Eagle extends Bird
{
    
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
        
    }

}


/*
  Note : 
  1) Always Check For The Right Side 
  2) 
 */