
package Concepts.Array;

import java.util.Arrays;

public class S09_125_VariableArgs {

    public static void main(String[] args) {

        System.out.println("-".repeat(32));

        // Splitting a string into an array using split() method
        String string = "Hello,world,this,is,a,string";
        String[] array = string.split(",");
        System.out.println(Arrays.toString(array));

        System.out.println("-".repeat(32));

        // Splitting a string into an array using capital letters
        String string1 = "HelloWorldThisIsAString";
        String[] array1 = string1.split("[A-Z]"); // Same
        System.out.println(Arrays.toString(array1));

        System.out.println("-".repeat(32));

        String string2 = "HelloWorldThisIsAString";
        // Splitting the string based on capital letters
        String[] array2 = string2.split("(?=[A-Z])");
        // Printing the resulting array
        System.out.println(Arrays.toString(array2));


        System.out.println("-".repeat(32));


        printText("Shivam","Pushkar","Binayak","Akshay","Sandesh");



    }

    public static void printText(String... ex)
    {
        for(String i : ex)
        {
            System.out.println(i);
        }
    }
}

/*
 * 
 * Note :
 * The regular expression "(?=[A-Z])" is using a positive lookahead assertion,
 * which checks for a specific condition without consuming the characters it
 * matches. In this case, it's checking if the next character is an uppercase
 * letter (A-Z) without actually including it in the match.
 * 
 * So, when you split the string using this regular expression, the split occurs
 * right before each capital letter, effectively including the capital letter in
 * the substring before it. This is because the lookahead assertion (?= ... )
 * only checks the condition without including the matched characters in the
 * result.
 * 
 * In contrast, if you directly used [A-Z] in the split() method, it would
 * consume the capital letters as delimiters and exclude them from the resulting
 * substrings.
 * 
 * [0-9] matches any digit from 0 to 9.
 * [a-z] matches any lowercase letter from a to z.
 * [A-Za-z] matches any uppercase or lowercase letter.
 * [0-9a-zA-Z] matches any alphanumeric character.
 * 
 */


 // What Is That The Three Period in Argument in the method ?

/* Answer :
 * Varargs stands for Variable Arguments or Variable length arguments.
 * - The parameters or value of parameters that you will send through the object
 * to the method of an object, it will reach as an array.
 * - Varags can be defined by using the three dots in a parameter of a method
 * like:
 * public int add(int ... i)
 * - After using varargs we need to use a loop for printing the values as
 * varargs accept values of a parameter as an array.
 * - We can pass multiple parameters and it will become an array in varargs.
 * 
 * Note:-
 * - There can be only one variable argument in a method.
 * - Variable argument ( varargs) must be the last argument.
 * - Varargs allows the method to accept zero or multiple arguments.
 */