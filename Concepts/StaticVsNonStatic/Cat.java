package Concepts.StaticVsNonStatic;

public class Cat {

    private static int catCount = 0;
    public static final int MAX_LIVES = 9;

    String name;
    int liveRemaining;
    int age;

    public void meow()
    {
        System.out.println("Meow Meow...");

    }

    public Cat() {
        catCount++;
        liveRemaining = MAX_LIVES;
    }

    public int getRemainingLiveCount()
    {
        return liveRemaining;
    }
    
    public static int getCatCount()
    {
        // System.out.println(age);     // It doesnt even make sense cause non static field only make sense in context of indiidual object and they can be different for individual object 
        return catCount;
    }

    
}
