public class S06_70_StringToINT {

    public static void main(String[] args) {
        
        String userBirthDate = "2006"; //This Is A String Value
        String Age = "25.5";
        int dateOfBirth=Integer.parseInt(userBirthDate);
        int CurrentYear=2023;

        //Remember Converting String Of Double Kind To Int Will Give Errors to The Program
        //So If The String Is of Int Type Use Integer.parseInt  && If It Is Of Double Type Use Double.parseDouble
        //int Age1 = Integer.parseInt(Age);

        double Age2 = Double.parseDouble(Age);

        //System.out.println("Age = "+(CurrentYear-userBirthDate)); //This Will Not Work Unless We Convert The String into INT Value
    
        System.out.println("Age = "+(CurrentYear-dateOfBirth));
        
        //System.out.println("Age With Integer Value Would Be "+Age1);

        System.out.println("Age With Double Value Would Be "+ Age2);
    }
}
