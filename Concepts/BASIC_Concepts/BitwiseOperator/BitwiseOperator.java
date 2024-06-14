package Concepts.BASIC_Concepts.BitwiseOperator;
/*
 * Youtube : Engineering Digest 
 * Youtube Link : https://www.youtube.com/watch?v=whb3BeqZc0M&t=7s
 */
public class BitwiseOperator 
{
    // operands --> byte short int long ( Only works with these )

    /*   |     Operands     |     Symbols     |
     *      and operator            &
     *      or operator             |
     *      xor                     ^
     *      not                     ~
     *      left shift              <<
     *      right shift             >>
     *      unsigned right shift    >>>
     */
    public static void main(String[] args) 
    {
        //  computer - -> 01
        int a = 5 ;
        int b = 4 ;
        System.out.println("--".repeat(10));
        System.out.println("(" +(a) +") in Binary : " + Integer.toBinaryString(a)); // 101
        // 00000000 00000000 00000000 00000101  ( Its Actually )    Usually ignores initial zeros 
        System.out.println("(" +(b) +") in Binary : " + Integer.toBinaryString(b)); // 100
        System.out.println("--".repeat(10));

        // And Case ( & ) 
        System.out.println(a+" AND "+"b : "+( a & b ));
        /*  Sum in this case 
            a -> 101
            b -> 100
                 ----
        result-> 100 ( 1 and 1 == 1 nothing else )

        */

        // Or Case ( | )

        System.out.println(a+" OR "+" b : "+( a | b ));
        /*  Sum in this case 
            a -> 101
            b -> 100
                 ----
        result-> 100 ( 1 and 1 == 1 or 0 and 1 == 1 and nothing else )
        */

        // XOR 
        System.out.println(a+" XOR "+"b : "+( a ^ b ));
        /*  Sum in this case 
            a -> 101
            b -> 100
                 ----
        result-> 100 ( 1 and 0 == 1 or 0 and 1 == 1 and nothing else )
        */


        // Not Operand ( ~ )
        int c = ~ a ;
        System.out.println("NOR ( "+ a +" ) value  : "+c);
        System.out.println("( "+a+" ) in Binary  : "+Integer.toBinaryString(a));
        System.out.println("( ~"+a+" ) in Binary : "+Integer.toBinaryString(c));
        /*
         * ( ~ ) In this case, changes every zero bit to 1 and vice versa & nothing else. 
         */

        //  For Right & Left Shift 

        /*
         * What it does is that it basically shifts the whole bitwise to the left or right as per 
         * the parameter and fills the remaining with zeros.  
         * 
         * For Example :
         * 
         *  1) Left Shift Operator
         *      
         *      1 0 1 ( Previous )
         *     / / /
         *    1 0 1 0 ( New and Updated )
         *  
         *  2) Right Shift Operator
         *  
         *     1 0 1 ( Prevoiusly )
         *      \ \ \ 
         *     0 1 0 1 ( New and Updated )
         */

        System.out.println("--".repeat(10));
        System.out.println("Left Shift of ( "+a+" )   \nPreviously       : "+Integer.toBinaryString(a)+"\nNew Binary Value : "+Integer.toBinaryString(a<<1)+"\nNewly Value      : "+(a<<1));
        System.out.println("--".repeat(10));
        System.out.println("Right Shift of ( "+a+" )  \nPreviously       : "+Integer.toBinaryString(a)+"\nNew Binary Value : "+Integer.toBinaryString(a<<1)+"\nNewly Value      : "+(a>>1));
        System.out.println("--".repeat(10));


        // Unshined Right Shift 
        System.out.println(Integer.toBinaryString(a)); // Fills Out the remaining spaces with values 1 
        System.out.println(Integer.toBinaryString(a>>>1)); // Removes one right element and shift whole thing to the right 

        //  InCase Of Negative 
        System.out.println(Integer.toBinaryString(-a)); // Fills Out the remaining spaces with values 1 
        System.out.println(Integer.toBinaryString(-a>>1)); // Removes one right element and shift whole thing to the right ( Includes Zero as One )
        System.out.println(Integer.toBinaryString(-a>>>1)); // Removes one right element and shift whole thing to the right ( Des Not Includes Zeros as One )

        //  Difference Between Unsigned Right Shift and Right Shift in Picture 
    }
}
