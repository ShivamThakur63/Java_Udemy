package Concepts.BASIC_Concepts;



import java.util.Calendar;

public class S07_96_TextFormatting {
    // So There Are Many Ways To Print A Sring The Previously used concating method
    // And Now Text Formatting Method
}

    class Main {

        public static void main(String[] args) {
    
            // printf() = 	an optional method to control, format, and display text to the console window
            //				two arguments = format string + (object/variable/value)
            //				% [flags] [precision] [width] [conversion-character]
                    
            boolean myBoolean = true;
            char myChar = '@';
            String myString = "Bro";
            int myInt = 50;
            double myDouble = 1000;
                
            // [conversion-character]
            System.out.printf("%b",myBoolean);
            System.out.printf("%c",myChar);
            System.out.printf("%s",myString);
            System.out.printf("%d",myInt);
            System.out.printf("%f",myDouble);
            
            //[width]
            // minimum number of characters to be written as output
            //System.out.printf("Hello %10s",myString);
            
            //[precision]
            // sets number of digits of precision when outputting floating-point values
            //System.out.printf("You have this much money %.1f",myDouble);
            
            // [flags]
            // adds an effect to output based on the flag added to format specifier
            // - : left-justify
            // + : output a plus ( + ) or minus ( - ) sign for a numeric value
            // 0 : numeric values are zero-padded
            // , : comma grouping separator if numbers > 1000
            
            //System.out.printf("You have this much money %,f",myDouble);     -->1,000.00
            //System.out.printf("You have this much money %020f",myDouble);   -->000000001000.00
            //System.out.printf("You have this much money %+f",myDouble);   --> +(number)
        }
    
    
    
    public static void run() {


        // Concat Method
        String Ex1 = "Three 3R Of Enviromnent \n \u2022 Reduce\n \u2022 Reuse \n \u2022 Recycle"; // \n - For Next Line
                                                                                                  // \u2022 - For Bulleting                                     
        System.out.println(Ex1);

        System.out.println();
        // Text Formatting Method
        String Ex2 = """                                                                        
                Three 3R Of Environment
                \t\u2022 Reduce
                \t\u2022 Reuse
                \t\u2022 Recycle
                        """;                                                                       // \t - For Tab Space
        System.out.println(Ex2);


        //Another String Formatting Method
        String name ="Shivam Kumar Thakur";
        String Name=String.format("My Name Is %s ",name );                                  //\s - For String Format
        System.out.println(Name);

        Name = "My Name Is %s ".formatted(name);
        System.out.println(Name);

        // Now Its Time for Format Specifier (Printf Statement)
        int Age = 19;
        int birthYear = 2024- Age;
        System.out.printf("Age = %d \n BirthYear = %d\n",Age,birthYear);
        System.out.printf("Age = %d \n BirthYear = %4d\n",Age,birthYear);                   //What This Does is That It Limits the number to only 4 numbers

        //Suppose We Only Need To Print First Two Decimals Of A Number Then 
        double Percentage = 3.343;
        System.out.printf("Your Percentage is %f \n",Percentage);      
        System.out.printf("Your Percentage is %.2f \n",Percentage);    //This Limits To Last Two Decimal Numbers Also Works with Integers Just Dont Add The (.)

        System.out.printf("Your Percentage is %d %n",(int)Percentage); //Also Works


        //Another Way
        for(int i=1;i<1000000;i*=10){
            System.out.printf("Printing %6d %n",i);
        }
        
    }



public void concept()
{
    System.out.printf("%d",10);        // 10 
    System.out.printf("%f",10.1);        // 10.100000
    System.out.printf("%c",'a');        // a
    System.out.printf("%C",'a');        // A
    System.out.printf("%s","hello");        // hello
    System.out.printf("%S","hello");        // Hello
    System.out.printf("%b",5<4);        // false
    System.out.printf("%B",5<4);        // FALSE
    // System.out.printf("%b", null);        // false
    System.out.printf("%b", "cow");        // true
    System.out.printf("%e", "10.123");        // 1.012300e+01
    System.out.printf("%E", "10.123");        // 1.012300E+01
    System.out.printf("%g", "10000.0");        // 10000.0
    System.out.printf("%G", "10000.0");        // 10000E + 06
    System.out.printf("%o", "10");        //  12(Octet)
    System.out.printf("%x", "10");        //  a(HexDecimal)
    System.out.printf("%X", "10");        //  A(HexDecimal)
    System.out.printf("%h", "hello");        //  5e918d2(HashCode)
    System.out.printf("%H", "hello");        //  5e918D2(HashCode)
    System.out.printf("%a", 10.12);        //  0X1.4d70a3d70a3dp3(Hexadecimal Floating point value)
    System.out.printf("%A", 10.12);        //  0X1.4D70A3D70A3DP3

    Calendar cal = Calendar.getInstance();
    System.out.printf("%tB",cal);       //October
    System.out.printf("%TB",cal);       //OCTOBER
    System.out.printf("%n");       //New Line
    System.out.printf("\n");       //New Line
    System.out.printf("%%");       //   %



    // Precision in Text Formatting

    double number = 10.1234;
    System.out.printf("%d",number);    //   10.123400  By Default double take 6 places


    double num = 12.34111423;
    System.out.printf("%.0f%n",num);       //12
    System.out.printf("%.1f%n",num);       //12.3
    System.out.printf("%.2f%n",num);       //12.34
    System.out.printf("%.3f%n",num);       //12.341
    System.out.printf("%.4f%n",num);       //12.3411
    System.out.printf("%.5f%n",num);       //12.34111
    System.out.printf("%.6f%n",num);       //12.341114
    System.out.printf("%.7f%n",num);       //12.3411142
    System.out.printf("%.8f%n",num);       //12.34111423
    System.out.printf("%.9f%n",num);       //12.341114320



    
    /*
    Can also use it with 
     * - String 
     * - Boolean 
     * - HexaDecimal
     
     Cannot use it with 
     * - Decimal or Integer Value
     * - Character 
     * - End of Line 
     */

     
}
    }