package Concepts.Java08.Stream.MapVFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * the only differnce between map and flatmap is that flatmap can help breaking 
 * up the collection but map only allows to work in a broken collection .
 */

public class Main {

    public static void main(String[] args) {

        List<String> employee1Cities = new ArrayList<>();
        employee1Cities.add("Pune");
        employee1Cities.add("Banglore");
        employee1Cities.add("Kolkate");
        employee1Cities.add("Patna");
        Employee employee1 = new Employee(1, "Moe", employee1Cities);

        List<String> employee2Cities = new ArrayList<>();
        employee2Cities.add("Pune");
        employee2Cities.add("Delhi");
        employee2Cities.add("Madhubani");
        employee2Cities.add("Maharastra");
        Employee employee2 = new Employee(2, "Lester", employee2Cities);

        List<String> employee3Cities = new ArrayList<>();
        employee3Cities.add("Pune");
        employee3Cities.add("Greater Noida");
        employee3Cities.add("Utrakhanda");
        employee3Cities.add("Mumbai");
        Employee employee3 = new Employee(3, "Lester", employee3Cities);

        List<String> employee4Cities = new ArrayList<>();
        employee4Cities.add("Pune");
        employee4Cities.add("Greater Noida");
        employee4Cities.add("Utrakhanda");
        employee4Cities.add("Mumbai");
        Employee employee4 = new Employee(3, "Lester", employee4Cities);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        System.out.println(employeeList);

        // You can easily do this right but how would you do it with Cities -> got'ya
        List<Integer> employeIdList = employeeList.stream().map(x -> x.getId()).collect(Collectors.toList());
        System.out.println(employeIdList);

        // I bet you didnt like this
        List<List<String>> cityWorkedInList = employeeList.stream().map(x -> x.getCitiesWorkedIn())
                .collect(Collectors.toList());
        System.out.println(cityWorkedInList);

        System.out.println("----".repeat(28));

        // Only gives Union and removes repeated item a lil bit better
        Set<List<String>> cityWorkedInSet = employeeList.stream().map(x -> x.getCitiesWorkedIn())
                .collect(Collectors.toSet());
        System.out.println(cityWorkedInSet);

        System.out.println("----".repeat(28));

        // For List in Stream Input
        List<String> cityWorkedInFlatMap = employeeList.stream().flatMap(x -> x.getCitiesWorkedIn().stream())
                .collect(Collectors.toList());
        System.out.println(cityWorkedInFlatMap);

        System.out.println("----".repeat(28));

        // For Set Value Option
        Set<String> cityWorkedInFlatMapSet = employeeList.stream().flatMap(x -> x.getCitiesWorkedIn().stream())
                .collect(Collectors.toSet());
        System.out.println(cityWorkedInFlatMapSet);

        System.out.println("----".repeat(28));

        // For Three3D List

        ArrayList<ArrayList<ArrayList<Integer>>> threeDList = new ArrayList<>();

        // Initialize the 3D list with some values
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        ArrayList<Integer> oneDList = new ArrayList<>();

        // Add elements to the 1D list
        oneDList.add(1);
        oneDList.add(2);
        oneDList.add(3);

        // Add the 1D list to the 2D list
        twoDList.add(oneDList);

        // Add the 2D list to the 3D list
        threeDList.add(twoDList);

        // Print the 3D list
        System.out.println(threeDList);

        System.out.println(threeDList.stream().map(x -> x.size()));
        System.out.println(oneDList.stream().map(x -> x.SIZE));

        // int lenOf1DListInside3D = threeDList.stream().flatMap(x ->
        // x.stream().flatMap(x -> x.stream()).map(x -> x.SIZE);
        long lenOf1DListInside3D = threeDList.stream()
                .flatMap(x -> x.stream())
                .flatMap(x -> x.stream())
                .count(); // Returns the numbes of element remaining in the Stream
        System.out.println(lenOf1DListInside3D);

        // System.out.println(threeDList.stream().flatMap(x -> x.stream()).flatMap(x ->
        // x.stream().map(List::size)).collect(Collectors.toList()));
        System.out.println(threeDList.stream()
                .flatMap(twoD -> twoD.stream()) // Flatten to a stream of 1D lists
                .flatMap(oneD -> oneD.stream()) // Flatten to a stream of integers
                .mapToInt(Integer::intValue) // Map each integer to its int value
                .count());

        // Flatten the 3D list to get all elements in a single list using flatMap
        List<Integer> flattenedList = threeDList.stream()
                .flatMap(twoD -> twoD.stream())
                .flatMap(oneD -> oneD.stream())
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        // Most Ideal Way

        // Find the size of the innermost list using streams
        // Get the length of each list inside the stream
        threeDList.stream()
                .flatMap(List::stream) // Flatten to a stream of 2D lists
                .flatMap(List::stream) // Flatten to a stream of 1D lists
                .forEach(System.out::println); // Print the size of each list

        // System.out.println("Size of the innermost list: " + size);
        //

        // The ideal Way

        List<List<Integer>> TwoDList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6, 7, 8, 9, 10));

        System.out.println(TwoDList);

        Integer sizeee = TwoDList.stream().mapToInt(List::size).sum();
        System.out.println(sizeee);

        // int[] sizeArray =
        // TwoDList.stream().mapToInt(List::size).distinct().toArray();
        int[] sizeArray = TwoDList.stream().mapToInt(List::size).toArray();
        long sizeCount = TwoDList.stream().mapToInt(List::size).count();
        List<Integer> sizeCount2 = TwoDList.stream().mapToInt(List::size).boxed().collect(Collectors.toList());
        // List<Integer> sizeCount2 =
        // TwoDList.stream().mapToInt(List::size).collect(Collectors.toList()); // Does
        // not compile
        System.out.println(sizeCount);
        System.out.println(Arrays.toString(sizeArray));

        /*
         * Use map when you want to transform elements of a stream into another type.
         * Use mapToInt when you specifically want to transform elements of a stream
         * into int values and work with primitive int values directly, potentially for
         * performance reasons.
         * 
         */

        /*
         * Can be used with mapToInt
         * Terminal Operations:
         * forEach(Consumer<? super Integer> action): Useful for performing an action on
         * each element of the stream.
         * 
         * sum(): Calculates the sum of elements in the stream.
         * 
         * min() and max(): Find the minimum and maximum values in the stream,
         * respectively.
         * 
         * average(): Computes the average of elements in the stream as a double value.
         * 
         * count(): Counts the number of elements in the stream.
         * 
         * toArray(): Collects the elements of the stream into an array.
         * 
         * Intermediate Operations:
         * filter(IntPredicate predicate): Filters the stream based on the given
         * predicate.
         * 
         * map(IntUnaryOperator mapper): Maps each element of the stream to another
         * integer using the given mapper function.
         * 
         * distinct(): Returns a stream consisting of distinct elements.
         * 
         * sorted(): Returns a stream consisting of elements sorted in natural order.
         * 
         * limit(long maxSize) and skip(long n): Truncates or skips elements of the
         * stream, respectively.
         * 
         * Conversion Operations:
         * boxed(): Converts the IntStream to a Stream<Integer>.
         * 
         * mapToObj(IntFunction<? extends U> mapper): Maps each element to an object
         * using the given mapper function.
         * 
         * Reduction Operations:
         * reduce(int identity, IntBinaryOperator op): Performs a reduction on the
         * elements of the stream using an associative accumulation function.
         * 
         * reduce(IntBinaryOperator op): Performs a reduction on the elements of the
         * stream using an associative accumulation function.
         * 
         * Matching Operations:
         * allMatch(IntPredicate predicate): Checks if all elements of the stream match
         * the provided predicate.
         * 
         * anyMatch(IntPredicate predicate): Checks if any elements of the stream match
         * the provided predicate.
         * 
         * noneMatch(IntPredicate predicate): Checks if no elements of the stream match
         * the provided predicate.
         */

    }
}
