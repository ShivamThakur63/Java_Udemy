package Concepts.Java08.PredFunConSup;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
    Whats a Consumer ?
    Consumer is just like us . It consumes and lefts no crumbs.

    It is used when we need to use something and not return anything like saving and storing something to the database .


 */
public class InConsumer {

    public static void main(String[] args) {
        
        Consumer<String> consumer = x -> System.out.println(x);

        Consumer<List<Integer> > listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li ->
        {
            for (Integer i : li) {
                System.out.println(i);
            }
            
        };

        Consumer<List<Integer>> listConsumer3 = listConsumer2.andThen(listConsumer1);
        // listConsumer1.accept(Arrays.asList(1,2,3,4,5,6,7));
        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4,5,6,7));
        listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4,5,6,7));

        listConsumer3.accept(Arrays.asList(1,2,3,4,5,6,7));
        // consumer.accept("Vipul");
    }
    
}
