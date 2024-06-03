package Concepts.S12_ComparableVsComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {

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

        // Collections.sort(artists,new SortByName());
        Collections.sort(artists, new Comparator<Artist>() {
            public int compare(Artist o1, Artist o2) {
                int result = o1.name.compareTo(o2.name);
                if (result == 0) {
                    result = o1.age.compareTo(o2.age);
                }
                return result;

            }

        });

       

        // All lambda Expressions Don't Worry you will get this one day 
        /* 
        Collections.sort(artists,( o1,  o2) -> {
            int result = o1.name.compareTo(o2.name);
            if (result == 0) {
                result = o1.age.compareTo(o2.age);
            }
            return result;

    });
        Collections.sort(artists,(o1,o2) -> o1.name.compareTo(o2.name));
        Collections.sort(artists,Comparator.comparing(Artist::getName).thenComparing(Artist::getAge)); 
        Collections.sort(artists,Comparator.comparing(Artist::getName).thenComparing(Artist::getAge).reversed()); 


        */
        // artists.sort(null);
        System.out.println(artists);
    }
}

class Artist implements Comparable<Artist> {
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

    @Override
    public int compareTo(Artist o) {

        // return age.compareTo(o.age); // works same as these 8 lines of code below

        /*
         * 
         * // One Way for simgle checking
         * if(this.age < o.age)
         * {
         * return -1;
         * }else if(this.age > o.age)
         * {
         * return 1;
         * }else{
         * return 0 ;
         * }
         */

        // 2nd Way of double checking
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return this.name.compareTo(o.name);

        }

    }

}

class SortByName implements Comparator<Artist> {

    @Override
    public int compare(Artist o1, Artist o2) {
        if (o1.name.equals(o2.name)) {
            return o1.age - o2.age;
        }

        else {
            return o1.name.compareTo(o2.name);
        }
    }

}

