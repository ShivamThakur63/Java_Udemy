class Car extends Vehicle implements Drivable {
    private int fuelLevel;

    public Car(String manufacturer, String model, int year, int fuelLevel) {
        super(manufacturer, model, year);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Starting the car.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking.");
    }
}

class Motorcycle extends Vehicle implements Drivable {
    public Motorcycle(String manufacturer, String model, int year) {
        super(manufacturer, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle.");
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The motorcycle is braking.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String manufacturer, String model, int year) {
        super(manufacturer, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting to pedal the bicycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bicycle.");
    }
}
