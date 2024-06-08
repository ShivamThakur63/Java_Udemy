package Concepts.JavaInnerClasses.Non_Static_Classes;

/*
 Features :
    1) These classes are not tied to an instance of the outer class. 
    2) They can only access static members of the outer class, including private ones.
    3) A static nested class is a static member of the outer class and can be created without an instance of the outer class.
    4) It is also known as a static inner class.
    5) It can be declared with access modifiers like public, default, private, and protected.
    6) The Java compiler creates a class file named Outer$StaticInner in this case.
*/

public class StaticInnerClass {

    static private String favoriteRapper = "Travis Scott";
    static String city = "Houston, Texas";
    static int albumsSold = 10000000;

    static class RapStats {
        void printRapperDetails() {
            // Accessing static variables directly
            System.out.println("Favorite Rapper : " + favoriteRapper);
            System.out.println("City : " + city);
            
            // Accessing static variable 'albumsSold' directly
            System.out.println("Albums Sold : " + albumsSold);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static inner class
        RapStats rapStats = new RapStats();

        // Invoking the method of the static inner class
        rapStats.printRapperDetails();
    }
}



//  If we create an object in another class 

/* 
public class RapStatsViewer {
    public static void main(String[] args) {
        // Creating an instance of the static inner class
        RapperManager.RapStats rapStats = new RapperManager.RapStats();

        // Invoking the method of the static inner class
        rapStats.printRapperDetails();
    }
}
*/