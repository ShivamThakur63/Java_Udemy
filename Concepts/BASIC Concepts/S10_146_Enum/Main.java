import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THRUSDAY;

        if (day == DaysOfTheWeek.THRUSDAY) {
            System.out.println("Yeah It s Thrusday !");
        }

        // DaysOfTheWeek.values(); // Returns All The Array Of The Values of enum

        // for(DaysOfTheWeek weekDays : DaysOfTheWeek.values()))
        // {
        // System.out.print(weekDays+" ");
        // }
        System.out.printf("Day : %s ,Ordinal Value : %d%n", day, day.ordinal());

        for (int i = 0; i < 7; i++) {
            var randomday = getRandom();
            System.out.printf("Day : %s ,Ordinal Value : %d%n", randomday, randomday.ordinal());
        }

        System.out.println("-".repeat(40));
        switchDays(day);

    }

    // Get RandomDays
    public static DaysOfTheWeek getRandom() {
        int random = new Random().nextInt(7);
        DaysOfTheWeek[] day = DaysOfTheWeek.values();

        return day[random];
    }

    // Switch Statement in Enum
    public static void switchDays(DaysOfTheWeek weekday) {
        int value = weekday.ordinal() + 1;
        switch (weekday) {
            case SUNDAY:
                System.out.println("Day : " + weekday);
                break;
            case SATURDAY:
                System.out.println("Day : " + weekday);
                break;
            default:
                System.out.println("Day : " + weekday.name().charAt(0) + weekday.name().substring(1).toLowerCase()
                        + " & Order : " + value);
                break;
        }
    }
}

// public class Main {
// public static void main(String[] args) {
// // Print information about each planet
// for (Planet planet : Planet.values()) {
// System.out.println("Planet: " + planet);
// System.out.println("Mass: " + planet.getMass() + " kg");
// System.out.println("Radius: " + planet.getRadius() + " meters");
// System.out.println();
// }

// // Example of using enum constant
// Planet earth = Planet.EARTH;
// System.out.println("Earth's mass: " + earth.getMass() + " kg");
// System.out.println("Earth's radius: " + earth.getRadius() + " meters");

// // if not final anyone can change the values this way
// // Planet.MARS.mass = 200;
// // System.out.println(Planet.MARS.mass);
// }
// }
