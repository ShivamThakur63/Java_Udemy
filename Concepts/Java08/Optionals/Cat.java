package Concepts.Java08.Optionals;

import java.util.Optional;

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


    public Optional<String> getOptionalName()
    {
        return Optional.ofNullable(getName());
    }

    public String getName() {
        return name;
    }
   

   

    
}
