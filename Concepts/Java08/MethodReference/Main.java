package Concepts.Java08.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> rappers = Arrays.asList("Tupas","Nas","Bigge","Ice Cube","Snoop Dog");

        System.out.println("==".repeat(10));
        rappers.forEach(x -> System.out.println(x));
        System.out.println("--".repeat(10));
        rappers.forEach(Artists::new);
        System.out.println("--".repeat(10));
        rappers.forEach(System.out::println);
        System.out.println("--".repeat(10));
        List<Artists> artistsList = rappers.stream().filter(x->(x.length()<=5)).map(Artists::new).collect(Collectors.toList());

        System.out.println("--".repeat(10));
        artistsList.forEach(Artists::toString);
        artistsList.forEach(x-> System.out.println(x.toString()));
        System.out.println("--".repeat(10));
        artistsList.forEach(Artists::print);
        System.out.println("--".repeat(10));
        artistsList.forEach(Artists::printobj);


        Artists eminem = new Artists("Eminem");
        // artistsList.forEach(eminem::printobj);
        artistsList.forEach(Artists::CustomNameWithNoParameters);
        artistsList.forEach(Artists::CustomNameWithParameters);
        artistsList.forEach(Artists::getName);

        System.out.println("--".repeat(10));
        System.out.println(eminem);

        System.out.println("--".repeat(10));
        artistsList.add(eminem);

        artistsList.forEach(Artists::print);
        

        

    }

    public static void print(String s,String j)
    {
        System.out.println(s);
    }
    
}


class Artists {

    private String name ;

    public Artists(String name)
    {
        this.name = name ;
        System.out.println("Rapper : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artists [name=" + name + "]";
    }

    public static void print(Artists a)
    {
        System.out.println(a);
    }

    public void printobj()
    {
        System.out.println(this.name);
    }

    public void CustomNameWithNoParameters( )
    {
        this.name = "Custom";
    }

    public static  void CustomNameWithParameters(Artists a )
    {
        a.name = "Custom";
    }

}
