package Concepts.BASIC_Concepts.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Car car = new Lamborghini("Urus",2020);
        Truck truck = new Truck("Ford", 2019);
        Airplane airplane = new Airplane("Boeing", 2020);

        // Test driving operations for each vehicle
        System.out.println("Testing Car:");
        testVehicle(car);

        System.out.println("\nTesting Truck:");
        testVehicle(truck);

        System.out.println("\nTesting Airplane:");
        testVehicle(airplane);

        // Test loading for Truck and Airplane
        System.out.println("\nTesting loading for Truck:");
        if (truck instanceof Loadable) {
            ((Loadable) truck).load();
        }

        System.out.println("\nTesting loading for Airplane:");
        if (airplane instanceof Loadable) {
            ((Loadable) airplane).load();
            ((Flyable) airplane).fly();
        }

        // System.out.println("\nTesting loading for Truck:");
        // if (truck instanceof Loadable abc) {
        //     abc.load();
        // }

        
    }

    // Method to test driving operations for a vehicle
    public static void testVehicle(Drivable vehicle) {
        vehicle.start();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.stop();
    }

}
