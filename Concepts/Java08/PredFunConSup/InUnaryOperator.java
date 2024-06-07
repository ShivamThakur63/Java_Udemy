package Concepts.Java08.PredFunConSup;

import java.util.function.Function;
/*
    If we have both input and output of same datatype then we use UnaryOperator 
 */
import java.util.function.UnaryOperator;

public class InUnaryOperator {
 
    public static void main(String[] args) {
        
        Function<Integer,Integer> function1 = x -> x*x;
        Function<String,String> function2 = str -> str.toLowerCase();

        UnaryOperator<Integer> unaryOperator = x -> x * x;  // public interface UnaryOperator<T> extends Function<T, T> 
        System.out.println(unaryOperator.apply(25));

        UnaryOperator<String> unaryOperator2 = str -> str.toUpperCase();
        System.out.println(unaryOperator2.apply("Shivam Thakur"));


    }

}
