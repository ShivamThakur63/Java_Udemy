package Concepts.Java08.PredFunConSup;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
    BiPredicate ;
     It takes two argument which somehow shortens the limitation of Predicate which only takes one parameter.
 */

public class ByPredicate {
    
    public static void main(String[] args) {
        
        Predicate<Integer> predicateThatChecksEven = x -> x % 2 == 0;
        BiPredicate<Integer,Integer> biPredicate1 = (x,y) -> x % 2==0 && y % 2 == 0 ;
        System.out.println(biPredicate1.test(2,4 ));     

        BiPredicate<String,Integer> biPredicate2 = (x,y) -> x.length() == y ;
        System.out.println(biPredicate2.test("Vipul", 5));


    }
}
