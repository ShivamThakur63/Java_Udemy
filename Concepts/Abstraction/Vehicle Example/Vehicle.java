abstract class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("The vehicle is braking.");
    }
}
