package Concepts.Java08.Optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Youtube Link  :   https://www.youtube.com/watch?v=vKVzRbsMnTQ
// Youtube Channel : Coding with John

/*
 * Optional is just like a box either it contains a cat or it does not contain anything and returns the empty box.
 * 
 * Optional<Cat> - contains either Cat object or null
 * 
 * We end up with same syntax as previous but it is for the developer to know that this method can return null object .
 * 
 * Optional are only supposed to ebe used s a return type not as a parameter.
 */

/*
 * Popular and Concerning Questions
 *  
 - Why use Optional.of over Optional.ofNullable?
    Your question is based on assumption that the code which may throw NullPointerException is worse than the code which may not. 
    This assumption is wrong. If you expect that your foobar is never null due to the program logic, it's much better to use 
    Optional.of(foobar) as you will see a NullPointerException which will indicate that your program has a bug. 
    If you use Optional.ofNullable(foobar) and the foobar happens to be null due to the bug, then your program will silently 
    continue working incorrectly, which may be a bigger disaster. This way an error may occur much later and it would be much 
    harder to understand at which point it went wrong.



    Take these two scenarios:

    Optional<Foo> opt = ...
    Foo x = opt.orElse( new Foo() );
    Foo y = opt.orElseGet( Foo::new );

    If opt doesn't contain a value, the two are indeed equivalent. But if opt does contain a value, how many Foo objects will be created?

    P.s.: of course in this example the difference probably wouldn't be measurable, but if you have to obtain your default value from a 
    remote web service for example, or from a database, it suddenly becomes very important.
    In the second case, it won't create a new Foo object, while in the first case it will create it, but not use it if there is a value inside the Optional.

    Short Answer:
    orElse() will always call the given function whether you want it or not, regardless of Optional.isPresent() value
    orElseGet() will only call the given function when the Optional.isPresent() == false
    In real code, you might want to consider the second approach when the required resource is expensive to get.
 */
public class Opt_CodeWithJohn {

    public static void main(String[] args) {

        System.out.println("----".repeat(10));

        Cat normalCat = findCatByNameNC("sa");

        // Checking if the object is null or not ( Old People .. )
        if (normalCat != null) {
            System.out.println("Cat Age  : " + normalCat.getId());
        } else {
            System.out.println("Object is null");
        }

        System.out.println("----".repeat(10));

        // Using Optional
        // You might be wondering then why the hell we even need optional if we can
        // already the same with checking value with null.
        // * We end up with same syntax as previous but it is for the developer to know
        // that this method can return null object .
        // Always use .get( ) with Present Only or you will end you with null pointer
        // exception

        Optional<Cat> cat = findCatByNameOPT("sa");

        // This approach is lengthy, and that’s not the only problem — it’s also prone
        // to error.
        if (cat.isPresent()) {
            System.out.println(cat);
            System.out.println("Cat Age  : " + cat.get().getId());
            System.out.println("Is Cat Empty ? (t/f) : " + cat.isEmpty());
        } else {
            System.out.println("Cat is not Present.");
        }

        // Can be represented in lamda form in this way
        cat.ifPresent(name -> System.out.println(name));

        System.out.println("----".repeat(10));

        Optional<Cat> nullOptionCat = findCatByNameNULL("Shivam");
        System.out.println(nullOptionCat);
        Cat nullCat = nullOptionCat.orElse(new Cat("Sofia", 4));
        System.out.println(nullCat);

        Optional<Cat> throwExCat = findCatByNameNULL("qq");
        Cat catThrowEx = throwExCat.orElseGet(() -> new Cat("Meouth", 2)); // Both does te same thing and throws
                                                                           // exception
        // Cat catThrowEx = throwExCat.orElseThrow(); // Both does te same thing and
        // throws exception
        // Cat catThrowEx = throwExCat.get();
        System.out.println(catThrowEx);

        throwExCat.map(Cat::getId).orElse(0);

        // Create Empty Optional Object
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // get() Method
        // empty.get();
        /*
         * However, unlike the previous three approaches, get() can only return a value
         * if the wrapped object is not null; otherwise, it throws a no such element
         * exception:
         * 
         * This is the major flaw of the get() method. Ideally, Optional should help us
         * avoid such unforeseen exceptions. Therefore, this approach works against the
         * objectives of Optional and will probably be deprecated in a future release.
         * 
         * So, it’s advisable to use the other variants that enable us to prepare for
         * and explicitly handle the null case.
         * 
         */

        // Filter in Optional
        Integer isEven = 8;
        String capitalOfNepal = "Kathmandu";

        boolean isDefEven = Optional.of(isEven).filter(x -> x % 2 == 0).isPresent();

        boolean isCapital = Optional.of(capitalOfNepal).filter(x -> x.toLowerCase().equals("kathmandu")).isPresent();
        System.out.println(isDefEven);
        System.out.println(isCapital);

        Cat cat2 = new Cat("Shila", 2);
        Cat cat3 = new Cat("Mia", 1);
        Cat cat4 = new Cat("Britney", 3);

        getFavCatWithParm(cat2);
        getFavCatWithParm(cat3);
        getFavCatWithParm(null);
        getFavCatWithParm(cat4);



        // map()

        List<String> companyNames = Arrays.asList(
            "paypal", "oracle", "", "microsoft", "", "apple");
          Optional<List<String>> listOptional = Optional.of(companyNames);
      
          int size = listOptional
            .map(List::size)
            .orElse(0);

        System.out.println(size);

        ArrayList<String> string = null;

        // int sizeOfStringList = Optional.of(string).map(ArrayList::size).orElse(0);      // Throws Exception
        int sizeOfStringList = Optional.ofNullable(string).map(ArrayList::size).orElse(0);      // Throws Exception
        System.out.println(sizeOfStringList);

        // try to  use map before filter like in case of password use trim before filtering

    }

    private static Optional<Cat> findCatByNameOPT(String name) {
        Cat cat = new Cat("Furry", 10);
        return Optional.of(cat);
    }

    private static Optional<Cat> findCatByNameNULL(String name) {
        Cat cat = new Cat("Furry", 10);
        return Optional.ofNullable(null);
    }

    private static Cat findCatByNameNC(String name) {
        Cat cat = new Cat("Furry", 10);
        return cat;
    }




    // Ancient Approach
    public static boolean getFavouriteCat(Cat cat) {
        boolean isFav = false;
        if ((cat != null) && (cat.getId() != 0) &&
                (cat.getId() >= 1) && (cat.getId() <= 2)) {
            isFav = true;
        }
        return isFav;
    }

    /*
     * The previous approach promises to check price range but has to do more than
     * that to defend against its inherent fragility. Therefore, we can use the
     * filter method to replace unnecessary if statements and reject unwanted
     * values.
     * 
     * 
     * The only part of the if condition that is critical to the application is the
     * last price-range check; the rest of the checks are defensive:
     * 
     * First of all, if a null object is passed to this method, we don’t expect any
     * problem.
     * 
     * Secondly, the only logic we write inside its body is exactly what the method
     * name describes — price-range check. Optional takes care of the rest:
     * 
     */
    // Mordern and Advanced Way
    public static boolean getFavCatWithParm(Cat cat) {
        return Optional.ofNullable(cat)
                .map(Cat::getId)
                .filter(x -> x >= 1)
                .filter(x -> x <= 2)
                .isPresent();
    }

}
