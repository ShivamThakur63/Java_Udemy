//AS The Version Of Java is Being Upgraded New And New Feature Are Added Continously
//Switch Statement Syntax Also Has Been modified And Updated Last Time 

    //In Switch Statement These are some new changes
        //Break Has Been Removed
            //Old Practice 
                // case 1 :
                // System.out.println("Hello World");
                // break;

            //New Practice
                // case 1 ->System.out.println("Hello World");

        //Switch As A Expression

                 // String day ="Sunday";
                 // String result;
                   // result = switch(day) {   (Expression)  
                   // case "Saturday","Sunday"-> "6am";  
                    
                 //switch(day) {
                 // case "Saturday","Sunday"-> result = "6am";
                 // case "Monday"->result ="8am";
                 // default -> result = "7am";
                 // }

        //Either Use All Column Or All Arrow
                //If You Want Use the Column just Add Yield To The Line
                 //For Example :
                    //case "Saturday" : yield "6am";
                    //case "Monday" : yield "7am";
                    //default : yield "8am";

                    //System.out.println(result);
    
public class S06_57_NewSwitchStatement {
    public static void main(String[] args) {
        String Phone = "Nokia";
        String Review ;
        Review = switch(Phone){
            case "Samsung"->"Excellent Choice ";
            case "Apple"->"Smart Decision";
            case "Nokia"->"Chad";
            case "Xiomi"->"Better Than Nothing";
            case "Motorola"->"Clean Stock Android Experience";
            case "Sony","LG","LTC","LAVA","INFINIX"->"Are You Dumb";
            default ->"Wise Decision Just Save Money and Stay Away From Toxic People On Internet";
        };
        System.out.println(Review);

    }
    
}