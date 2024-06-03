package Concepts.Generics_Example;


public class Employee {

    String name ;
    public void work()
    {
        System.out.println(name +" Workin...");
    }

    public Employee(int i, String name, int j )
    {
        this.name = name;
    }

    public Object getName() {
       return name;
    }

    public Employee(String name) {
        this.name = name;
    }
    

}

