package Concepts.Java08.Optionals;


public class Cat 
{
    String name ;
    int id;

    public Cat(String name,int id) 
    {
        this.id = id;
        this.name = name ;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", id=" + id + "]";
    }

    public int getId() {
        return id;
    }


   

   

    
}
