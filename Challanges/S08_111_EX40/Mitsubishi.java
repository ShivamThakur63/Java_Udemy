package S08_111_EX40;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
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