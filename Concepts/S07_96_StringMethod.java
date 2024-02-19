public class S07_96_StringMethod {
    public static void main(String[] args) {
    
        // 1)Equals Method 
        String Name="Shivam Kumar Thakur";
        String name="Shivam Kumar thakur";
        String Another="  Hello World  !!      ";
        String Another1="           ";
        String Name1="Harry";
        String Name2="Harryrry";
        boolean yesorno=Name.equals(name); 
        System.out.println(yesorno);
        //Note :- So It is Case Sensetive And Also Not Ignores Spaces 

        //Solution :-
        yesorno=Name.equalsIgnoreCase(name);
        System.out.println(yesorno); //It Ignore Case But Not Spaces



        // 2)Length Method
        int result = Name.length();
        System.out.println(result);//It Not Only Counts The Elements But Also Spaces 


        // 3) CharAt Method
        char Letter = Name.charAt(result-6);
        System.out.println(Letter);//It Will Print Out Character At Index At 14

        // 4)Index Of Method
        int result1=Name.indexOf("r");
        System.out.println(result1);// It Will Return The index At Which A Certain Element Of A Word Is Located In Form of Number
        System.out.println("Hello");
        System.out.println(Name2.indexOf("ry",4,8)); //So If It Doesnt Match With Any Of The Number It Will Return -1 Else The Stating Point
        System.out.println(Name2.lastIndexOf("ry")); //So Last Index Returns The Last Index Number which has the value
        System.out.println(Name2.lastIndexOf("ry",4)); //So It Will Return Value Where it finds that letter Within starting From First 4 letters ex-Harry

        // 5) IsEmpty Method
        boolean result3 = Name.isEmpty();
        System.out.println(result3); //Returns Boolean Value. If String is Empty Then Return True Else False

        // 6) UpperCase And LowerCase 
        String result4=Name.toUpperCase();
        System.out.println(result4);
        result4=Name.toLowerCase();
        System.out.println(result4);

        // 7) Trim Method
        String result5=Another.trim();
        System.out.println(result5);//  It Will Remove The Unnecessary Spaces Before And After The String Letters

        // 8) Replace Method
        String result6=Name1.replace("r", "p");//can also use replace all
        System.out.println(result6); //Will Replace A Letter With Another One But Is Case Sensetive
        result6=Name1.replaceFirst("r", "p");
        System.out.println(result6);


        // 9)Substring 
        System.out.println(Name1.substring(1));            //Will Go To The End Without An End Index
        System.out.println(Name1.substring(2,4)); //Will include 2nd One But Will Exclude The Last One 
        System.out.println(Name1.substring(2,5)); // Will Include the Last One Becuase the Index Here Is For Five (5)

        // 10) Starts With And Ends With
        System.out.println(Name1.startsWith("Ha"));
        System.out.println(Name1.endsWith("rey"));
        System.out.println(Name1.endsWith("rry"));

        // 11) Escape Sequence 
            // /n--New Line 
            // //--One Slash
            // /'--One Quotation
            // /"--Single Double Quotation
            // /t--For Tab
            // /b--For Backspace
                //For Example
                 System.out.println("Hello\bWorld!!");
            // \r--For Carriage Return
                //For Example
                System.out.println("Namaste Hello\rWorld!!");

        // 12)Blank Method 
        System.out.println(Another1.isBlank());
        System.out.println(Another1.length());

        //13) Contains Method 
        System.out.println(Another.contains("Hello "));//Will Also Consider Space
        System.out.println(Name.contains("kumar"));    //Its Case Sensetive So Will Also Consider Spelling Case

        //14) Content Equal 
        System.out.println(Name1.contentEquals("Harry"));//Will Chaek The Whole Sentence //Case Sensetive //Spaces Not Ignored

        //.Equals() And (==) Method Difference
        // So (==) & .equal() both are derived from object class, (==) to refers to memory locations or referencing,
        // but .equals() refers to the content inside.(==) and .equal()Represent The same in the object class
        //Youtube Video Link https://www.youtube.com/watch?v=i7vYjvJOIiw
        //(==) Used For primitive Types
        String a="Hello";
        String b="Hello";
        String c= new String("Hello1");
        String d= new String("Hello1");

        if(a==b){
            System.out.println("Match 1 Found");
        }

        if(c==d){
            System.out.println("Match 2 Found");
        }else if(c.equals(d)){
            System.out.println("Match 3 Found");//Replaced d with a worked
        }else{
            System.out.println("Match Not Found");
        }

        
    
    // 15) Repeat Method
    // int number =20;
    System.out.println("HaHa :) ".repeat(3));
    // System.out.println(number.repeat(4)); Remember Cannot Be Used Other Than Primitive Type
    System.out.println(Name1.repeat(4));


    //Now To Ad Spaces After And Before Them 
    // 16) Indent Method 
    System.out.println("hello\n".repeat(20).indent(6));
    System.out.println("    hello\n".repeat(20).indent(-2));

    // 17) String Join 
    String str = String.join("/", "26","06","2006");
    System.out.println(str);

    name="ddd";
    System.out.println(name);


    }
    
}
