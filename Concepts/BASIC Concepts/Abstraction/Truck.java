package Abstraction;

public class Truck extends Vehicle implements Drivable, Loadable {

    public Truck(String manufacturer, int yearOfManufacture) {
        super(manufacturer, yearOfManufacture);
    }

    @Override
    public void load() {
        System.out.println("Loading Stuff.. On " + "Truck");
    }

    @Override
    public void start() {
        System.out.println("Starting Engine.. Of " + "Truck");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleraing Engine..Of " + "Truck");
    }

    @Override
    public void brake() {
        System.out.println("Applying Brake..Of " + "Truck");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Engine..Of " + "Truck");
    }
    @Override
    public String toString() {
        return "Truck [Manufacturer = "+manufacturer+
        " YearOfManufacture = "+yearOfManufacture +"]";
    }
    
}
