package S10_146_Enum;

    // Its  a list that stores a contant values  starting at 0
public enum DaysOfTheWeek 
{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY;
// }

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6), MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7), SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7), NEPTUNE(1.024e+26, 2.4746e7);
    
    // will always be final because if its not what's the point of creating it. 
    private final double mass; // in kilograms
    private final double radius; // in meters
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }
    
    public double getRadius() {
        return radius;
    }
}
}



/*
  Note :
    1) values(): This method returns an array containing all the enum constants defined in the enum in the order they are declared.
    2) valueOf(String name): This method returns the enum constant with the specified name. 
        It throws an IllegalArgumentException if no enum constant with the specified name is found.
    3) ordinal(): This method returns the ordinal value of the enum constant, which is its position in the enum declaration (starting from zero).
    4) name(): This method returns the name of the enum constant as a String.


    enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

    public class EnumMethodsExample {
        public static void main(String[] args) {
            // Suppose we obtain the day of the week as a string from an external source
            String dayString = "WEDNESDAY";

            // Convert the string representation back into the corresponding enum constant
            DayOfWeek wednesday = DayOfWeek.valueOf(dayString);
            System.out.println("Day obtained from string: " + wednesday);

            // Get the name of the enum constant
            String name = wednesday.name();
            System.out.println("Name of the enum constant: " + name);

             // Using ordinal() method to get the ordinal value of an enum constant
            int ordinal = wednesday.ordinal();
            System.out.println("Ordinal of Wednesday: " + ordinal);

            // Using values() method to get all enum constants
              DayOfWeek[] days = DayOfWeek.values();


              Check This Out :
              public FlightStage getNextStage(FlightStage currentStage) {
                FlightStage[] allStages = FlightStage.values();
                return allStages[(currentStage.ordinal() + 1) % allStages.length];

                What the F is that ?
                So If we have next element 
                Current stage's ordinal value: 4
                    Adding 1 to it: 4 + 1 = 5
                    Array length: 7
                    So, (4 + 1) % 7 = 5 % 7 = 5

                If we Dont have next element(Will be Back To The First)
                    Current stage's ordinal value: 6
                    Adding 1 to it: 6 + 1 = 7
                    Array length: 7
                    So, (6 + 1) % 7 = 7 % 7 = 0.


    }
    

        }
}


 */