package Concepts.Java08.PredFunConSup;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InSupplier {

    public static void main(String[] args) {
        

        Supplier<String> supplier1  = () -> "Hello";
        Supplier<Integer> sup  = () -> 1;

        System.out.println(supplier1.get());
        System.out.println(sup.get());

        Predicate<Integer> predicate = x -> x%2 == 0 ;
        Function<Integer,Integer> function = x -> x * x ;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier <Integer> supplier = () -> 100;

        if (predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }
    }
    
}
