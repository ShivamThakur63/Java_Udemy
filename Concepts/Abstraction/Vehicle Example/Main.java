public class Main {
    public static void main(String[] args) {

        // Create instances of different vehicles
        Car car = new Car("Toyota", "Camry", 2020, 100);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        Bicycle bicycle = new Bicycle("Giant", "Defy", 2019);

        // Polymorphic behavior using abstract class
        System.out.println("Polymorphic behavior using abstract class:");
        driveVehicle(car);
        driveVehicle(motorcycle);
        driveVehicle(bicycle);

        // Polymorphic behavior using interface
        System.out.println("\nPolymorphic behavior using interface:");
        driveDrivable(car);
        driveDrivable(motorcycle);

    }

    // Define methods to drive vehicles and drivable objects
    public static void driveVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.stop();
        System.out.println();
    }

    public static void driveDrivable(Drivable drivable) {
        // drivable.start();
        drivable.accelerate();
        drivable.brake();
        System.out.println();

    }

}
