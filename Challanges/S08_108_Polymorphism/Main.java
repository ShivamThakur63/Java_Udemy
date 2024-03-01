package S08_108_Polymorphism;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}


/* 
public class Main {
    
    public static void main(String[] args) {

    Car a = new GasPoweredCar();
    if(a instanceof Car){
        System.out.println("true a is a instance of  car ");
        a.startEngine();
        a.runEngine();
        a.drive();
    }
    
    Car b = new ElectricCar();
    if(b instanceof Car abc){
        System.out.println("true b is a instance of  car ");
        abc.startEngine();
        abc.runEngine();
        abc.drive();
    }

    HybridCar c = (HybridCar) Car.getCarType("H");
    c.startEngine();
    c.runEngine();


}
}
*/