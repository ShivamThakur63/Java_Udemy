package Concepts.BASIC_Concepts.Abstraction;

public class Airplane extends Vehicle implements Loadable, Flyable {

    public Airplane(String manufacturer, int yearOfManufacture) {
        super(manufacturer, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Airplane [Manufacturer = " + manufacturer +
                " YearOfManufacture = " + yearOfManufacture + "]";
    }

    @Override
    public void start() {
        System.out.println("Starting Engine.. Of " + "Airplane");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleraing Engine..Of " + "Airplane");
    }

    @Override
    public void brake() {
        System.out.println("Applying Brake..Of " + "Airplane");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Engine..Of " + "Airplane");
    }

    @Override
    public void load() {
        System.out.println(
                "Loading Cargo and Ounces Of Cocaine on " + "Airplane" + " to supply to Mexico");
    }

   

    @Override
    public void fly() {
        System.out.println("Airplane Flying ...");
    }

}
