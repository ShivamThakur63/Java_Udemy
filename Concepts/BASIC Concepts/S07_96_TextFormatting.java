public class S07_96_TextFormatting {
    // So There Are Many Ways To Print A Sring The Previously used concating method
    // And Now Text Formatting Method


    public class Main {

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
    }
    
    
    public static void main(String[] args) {


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

}