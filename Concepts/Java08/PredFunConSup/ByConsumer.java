package Concepts.Java08.PredFunConSup;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ByConsumer {

    public static void main(String[] args) {
        
        Consumer<String> consumer  = (x) -> System.out.println(x+" stored in the database.");

        consumer.accept("Vipul");



        BiConsumer <String,Integer> consumer2 = (x,y) -> System.out.println(x + " with id '"+y+"' stored in the Student database.");

        consumer2.accept("Binayak", 1);

    }
    
}
