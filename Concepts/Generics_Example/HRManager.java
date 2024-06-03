package Concepts.Generics_Example;

public class HRManager extends Employee {

    public HRManager(String name) {
        super(name);
    }
    
    public void eat()
    {
        System.out.println(name+" Eatin...");
    }
}
