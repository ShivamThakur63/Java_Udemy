package Concepts.Java08.PredFunConSup;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class InBinary0perator {
    
    public static void main(String[] args) {
        

        BiFunction<String,String,String> biFunction1 = (x,y) -> x+" "+y;
        System.out.println(biFunction1.apply("Hello", "World"));


        // can achieve similarity by using Binary Operator if we have all the parameters the same

        BinaryOperator<String> binaryOperator = (str,str1) -> str+" "+str1;
        System.out.println(binaryOperator.apply("Hello", "World"));
    }
}
