package Concepts.Java08.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingAndCounting 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>(List.of("John","John","Marian","Alex","Alex","Ali","Ali","Mohammad","Mohammad"));
        System.out.println(names);

        Map<String, Long> counting = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counting);

        counting.forEach((name,count)-> System.out.println(name + " > " + count));

    }    
}
