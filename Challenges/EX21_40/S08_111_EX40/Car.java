package Challenges.EX21_40.S08_111_EX40;

public class Car {
    @SuppressWarnings("unused")
    private boolean engine;
    private int cylinders;
    private String name;
    @SuppressWarnings("unused")
    private int wheels;
    
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    
    public String startEngine() {
        return ("The engine of the " + getClass().getSimpleName() + " is starting");
    }
    
    public String accelerate() {
        return ("The " + getClass().getSimpleName() + " is accelerating");
    }
    
    public String brake() {
        return ("The " + getClass().getSimpleName() + " is breaking.");
    }
    
    public int getCylinders() {
        return cylinders;
    }
    
    public String getName() {
        return name;
    }
}