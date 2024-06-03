package Concepts.Exception_Handling;

public class V84_FinallyKeyword {
    
        public static void main(String[] args) {
            try {
                // Some code that might throw an exception
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handle the exception
                System.out.println("Error: Division by zero");
            } finally {
                // This block will always execute, regardless of whether an exception occurred or not
                System.out.println("Finally block executed");
            }
        }
        
        // Method to perform division and throw an exception if the divisor is zero
        public static int divide(int dividend, int divisor) {
            return dividend / divisor;
        }
    }

