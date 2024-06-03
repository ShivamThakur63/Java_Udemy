package Concepts.Exception_Handling;

class NegativeRadiusException extends Exception{
    
    public NegativeRadiusException(String a)
    {
        super(a);
    }
}

public class Throws_Keyword {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException("Radius cannot be less than zero.");
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try{
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(-6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception"+e);
        }
    }
}
