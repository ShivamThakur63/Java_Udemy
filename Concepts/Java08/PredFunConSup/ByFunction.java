package Concepts.Java08.PredFunConSup;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ByFunction {

    public static void main(String[] args) {

        Function<String,String> function1 = x -> "Good Morning, "+x+"\nHope you have a great day.";

        System.out.println(function1.apply("Vipul"));


        BiFunction<String,String,String> biFunction1 = (x,y) -> "Happy Marriage, "+x+" and "+y+"\nHope you have a great married life.";

        System.out.println(biFunction1.apply("Kanye", "Kim"));
    }
    
}
