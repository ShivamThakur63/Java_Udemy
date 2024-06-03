package Concepts.Generics_Example;

public class Accountant extends Employee {
    
    public Accountant(String name) {
        super(name);
        
    }

    public void work()
    {
        System.out.println(name +" Workin...");
    }

    public void sleep()
    {
        System.out.println(name+" Sleepin..");
    }
}
