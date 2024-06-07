package Concepts.Java08.LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InComparator {
    

    public static void main(String[] args) {


         List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(32, "Kendrick Lamar", "New York"));
        artists.add(new Artist(37, "Drake", "Toronto"));
        artists.add(new Artist(46, "Kanye West", "Chicago"));
        artists.add(new Artist(27, "Playboi Carti", "Atlanta"));
        artists.add(new Artist(40, "Future", "Atlanta"));
        artists.add(new Artist(30, "Metro Boomin", "St. Louis"));
        artists.add(new Artist(30, "Eminem", "Detroit"));
        artists.add(new Artist(31, "Ice Cube", "Los Angles"));
        artists.add(new Artist(30, "Ice Cube", "Los Angles"));

        
        
        System.out.println("Artists Before Sorting ");
        System.out.println("---".repeat(10));
        // int i = 1 ;  // can't do this way using forEach lamda expression
        final int[] index = {0}; // Initialize an array to hold the index

        // artists.forEach(n ->  System.out.println( ++i +".    "+n.getName()  )); // can't be compiled 
        artists.forEach(n ->  System.out.println( ++index[0] +".    "+n.getName()  ));

        // you can't change the local variable which are captured by lamda even one they need to be final 
        System.out.println("---".repeat(10));

        System.out.println("Artists After Sorting ");
        System.out.println("---".repeat(10));

        int [] anotherIdx = {0};
        Collections.sort(artists,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        artists.forEach(n ->  System.out.println(++anotherIdx[0] +".    "+n.getName() )  );
    }

}


class Artist {
    Integer age;
    String name;
    String city;

    public Artist(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Artist [age=" + age + ", name=" + name + ", city=" + city + "]\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
}