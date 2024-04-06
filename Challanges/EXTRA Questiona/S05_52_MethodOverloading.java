public class S05_52_MethodOverloading {
    public static double convertToCentimeters(int heightinInches ){

        //This Will Convert The Inches Into Centimeter As(1inch --> 2.54cm)
        double heightinCentimeters = (heightinInches * 2.54);
        return heightinCentimeters;
    }
    public static double convertToCentimeters(int heightinFeet,int remainingInches) {

        //We Will Not Use Casting In This Because Multiplication Never Gives Decimal Values
        heightinFeet = (heightinFeet*12);
        double Centimeter1 = convertToCentimeters(heightinFeet);
        double Centimeter2 = convertToCentimeters(remainingInches);

        return Centimeter1+Centimeter2;

        // heightinFeet =(heightinFeet*12);
        // double abcd =convertToCentimeters(heightinFeet);
        // double xyz = convertToCentimeters(remainingInches);
        
        //return abcd+xyz;

    }
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5,9));
    }
}
