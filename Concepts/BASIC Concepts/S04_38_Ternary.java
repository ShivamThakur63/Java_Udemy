//Ternary Operator Also Called Conditional Operator

//Has Three Operands  
//operand1 ? operand2 : operand3  (Structure)
//It Tests If Operand1 Is True Or Not  
//If It is true It Returns Operand2 Otherwise Operand3

//Now Lets Try Something 

public class S04_38_Ternary {
    public static void main(String[] args) {
        String Brand = "Microsoft"; 
        boolean Product = Brand == "Microsoft" ? true :false;
        //In This Case 
        //boolean Is The DataType For Output Here So Either True OR False is the Result
        //Product Is The Variable Where The Result is Saved
        //[Brand == "Microsoft"] is the first operand and Also Then Condition
        
        System.out.println(Product);
    

    //Now Lets Try To Return A String Variable As a Result

        int Age = 18;
        int Number = 23;
        String Eligibility = Age <= 18 ? "You Are Eligibe" : "You Are Not Eligible";
    
        System.out.println(Eligibility);

        printAge(Number);

    }

//Nested Ternary Operator
//Note : We Can Do Something Like This Too For Clean Presentation
    public static void printAge(int Number) {
  
        String Type = Number>0 ? "Positive" :Number<0 ?"Negative" : "Zero";
        System.out.println(Type);
    }

  
 }