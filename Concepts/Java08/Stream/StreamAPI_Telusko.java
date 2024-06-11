package Concepts.Java08.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Documentation Link :  https://www.geeksforgeeks.org/stream-in-java/

/*
 * Why we need Stream API ?
 * When working with stream we dont change the existing list and not mutate the list
 * Once you consume the stream you cant reuse it   
 * if we are creating a new stream on each step hen why we even want to make one as it will ast much more variable and memory but thats not the case once a stream is made and used its scope and visibility is over and is consumed
 */
public class StreamAPI_Telusko 
{
    
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> twoTimesOfnums = nums.stream()
                    .map(n -> n * 2 )       // total umber of stream used 3 
                    .collect(Collectors.toList());
        System.out.println("Previously , "+nums);
        System.out.println("Updated , "+twoTimesOfnums);

        // Once you consume the stream you cant reuse it 

        Stream<Double> square = nums.stream().map(n -> Math.pow(n, 2));
        // Stream<Integer> square = nums.stream().map(n -> n ^ 2);  // dont know why this shit gives different result.
        // long count = square.count();
        // System.out.println("Count Number : " +count);
        square.forEach(x -> System.out.println(x));


        Stream<Integer> sortedData = nums.stream().sorted((a,b)->b-a);
        // Stream<Integer> sortedData = nums.stream().sorted(); // can take no parameter meaning ascending order 


        // To get Sum Total Of The List  
        int sumTotal =  nums.stream().sorted((a,b)->b-a).map(n -> (int) Math.pow(n, 2)).reduce(0,(c,e) -> c + e);

        System.out.println(sumTotal);

        Optional<Integer> a = nums.stream().findAny();
        System.out.println(a);
    }
}
