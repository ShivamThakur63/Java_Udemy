package EX21_40.S08_111_EX40;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    
    @Override
    public String startEngine() {
        return ("The engine of the " + getClass().getSimpleName() + " is starting");
    }
    
    @Override
    public String accelerate() {
        return ("The " + getClass().getSimpleName() + " is accelerating");
    }
    
    @Override
    public String brake() {
        return ("The " + getClass().getSimpleName() + " is breaking.");
    }
}