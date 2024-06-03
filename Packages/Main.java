package Packages;   // Declares that this file is within the Packages Folder 

import java.util.ArrayList;
import java.util.List;

// Recommended : In order to make package name unique use your reversed domain name .

//  Foe eg ; com.apple, com.google, com.shivamthakur

import Packages.Vehicle.AirWays.Commercial.Aeroplane;
// import Packages.Vehicle.AirWays.*;   // Doesnt do shit it does not touch folder its just like Drake it only care for minors.
import Packages.Vehicle.RoadWays.Car;
import Packages.Vehicle.RoadWays.MotorBike;

// import Packages.Vehicle.*;  // will import all the file inside that folder (I repeat only files not Folder).

public class Main 
{
    public static void main(String[] args) {
        

        WheelChair wheelChair = new WheelChair();

        MotorBike motorBike = new MotorBike();

        Car car = new Car();

        Aeroplane airPlane = new Aeroplane();

        // Temp temp = new Temp();



        // only to minimize the local varible not used 
        List list = new ArrayList(List.of(car,motorBike,airPlane,wheelChair));

        
        





    }
}
