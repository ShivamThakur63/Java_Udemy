package Concepts.Java08.Stream;


import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Importance of Stream ( Why ? )
      - Readability ( Obvoius innit )
      - Flexibility 
        Allows you to perform various operation on collections 
        such as filtering, mapping and reducing.
      - Parallelism
        In Large Collection using 'for loop' we used to process one by one 
        but with 'Parallel Stream' a large collection can be broken into smaller 
        chunk or pieces and processed parallely and by using multicore processor 
        we can process simultaneousy as fast as possible.
      - Encapusulation 


 */
public class Stream_ErDigest {

    public static void main(String[] args) {
        List<String> footballPlayer = Arrays.asList("Lionel Messi", "Cristiano Ronaldo", "Kylian Mbappé", "Neymar",
                "Halland");

        Stream<String> stream = footballPlayer.stream();
        stream.forEach(System.out::print);
        footballPlayer.stream();

        Stream<String> indianCricketers = Stream.of("Virat Kohli", "MS Dhoni", "Rohit Sharma", "Shubham Gill", "SKY",
                "Hardik Pandeya");
        indianCricketers.forEach(System.out::println);

        // Just like for loop for Stream API to iterate between a certain range
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1).limit(10);
        iterateStream.forEach(System.out::println);

        System.out.println("--".repeat(10));

        // When we need to create something in stream API we use this
        Stream<Integer> generateStream = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        generateStream.forEach(System.out::println);

        System.out.println("--".repeat(10));
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9);
        List<Integer> listInt = list.stream()
                .filter((x) -> x % 2 == 0)
                .collect(Collectors.toList());
        listInt.forEach(System.out::println);

        System.out.println("--".repeat(10));
        List<Integer> mappedInteger = listInt.stream()
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        mappedInteger.forEach(System.out::println);
        System.out.println("--".repeat(10));
                
        // Combining various stream operations to create a list of processed values
        List<Integer> collect = Stream.iterate(0, n -> n + 1)
                .limit(101) // Limits to 101 elements
                .skip(1) // Skips the first element
                .filter(x -> x % 2 == 0) // Predicate: keeps only even numbers
                .map(x -> x / 20) // Function: divides each element by 20
                .distinct() // Removes duplicates
                .peek(x -> System.out.println(x)) // Intermediate operation to debug/peek at the values
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("--".repeat(10));

        int minimum = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 20)
                .distinct()
                .min((a, b) -> a - b) // returns an optional
                .get();

        System.out.println(minimum);

        // Same for Maximum

        // Count requires long and return the number of values present in the stream
        // after operations
        long count = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 20)
                .distinct()
                .count();

        System.out.println(count);

        /*
         * Terminal Operation : used at last of stream operations
         * - min
         * - max
         * - count
         * - collect
         */

        /*
         * Parllel Stream : Is used for bigger collections should not be used with small
         * list because thread assigning and allocation and also converting it back into
         * a single stream will increase overhead.
         * Also Sometimes your values are dependent upon your earlier claculation because it will do the operations parallely 
         */
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5, 6);
        listInteger.parallelStream();


        

    }
}



/*
Explanation of Operations and Their Use Cases

Creating a Stream:
        footballPlayers.stream(): Converts the list footballPlayers into a stream for further processing.
        Stream.of(...): Creates a stream from given elements.
forEach():
        Parameters: A consumer that performs an action for each element.
        Real-life use: Printing each element of a collection or performing some action on each element.
iterate():
        Parameters: Seed (initial element), UnaryOperator (function to apply to the previous element to produce the next).
        Real-life use: Generating sequences, like timestamps or IDs.
generate():
        Parameters: Supplier that generates new elements.
        Real-life use: Creating streams of random numbers, infinite sequences.
filter():
        Parameters: Predicate (condition to filter elements).
        Real-life use: Filtering data based on conditions (e.g., filtering out invalid inputs).
map():
        Parameters: Function to transform each element.
        Real-life use: Transforming data, like converting units or formats.
distinct():
        Parameters: None.
        Real-life use: Removing duplicates from a collection.
sorted():
        Parameters: Comparator to define the sort order.
        Real-life use: Sorting data, like ordering products by price or name.
limit():
        Parameters: Max size of the stream.
        Real-life use: Limiting results (e.g., top N results in search).
skip():
        Parameters: Number of elements to skip.
        Real-life use: Paginating results (e.g., skipping first N items in search).
collect():
        Parameters: Collector to gather elements into a collection.
        Real-life use: Collecting processed data into lists, sets, or other collections.
peek():
        Parameters: Consumer to perform an action on each element without modifying the stream.
        Real-life use: Debugging intermediate stream operations.
min() / max():
        Parameters: Comparator to find the min/max element.
        Real-life use: Finding the smallest/largest value in a dataset (e.g., min/max salary).
count():
        Parameters: None.
        Real-life use: Counting elements after processing (e.g., number of valid entries).
parallelStream():
        Parameters: None.
        Real-life use: Parallel processing of large collections to improve performance. Be cautious with dependent calculations.
 */