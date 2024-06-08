package Concepts.BASIC_Concepts.Abstraction;


public abstract class Car extends Vehicle implements Drivable {

    public Car(String manufacturer, int yearOfManufacture) {
        super(manufacturer, yearOfManufacture);
    }

    @Override
    public void start() {
        System.out.println("Starting Engine.. Of "+ "Car");
    }
    
    @Override
    public void accelerate() {
        System.out.println("Acceleraing Engine..Of "+ "Car");
    }
    
    @Override
    public void brake() {
        System.out.println("Applying Brake..Of "+ "Car");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping Engine..Of "+ "Car");
    }

    @Override
    public String toString() {
        return "Car [Manufacturer = "+manufacturer+
        " YearOfManufacture = "+yearOfManufacture +"]";
    }
    
        
    
}
