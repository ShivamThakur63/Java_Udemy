// Create A Class Called Class
// Three Fields
// name
// credit limit
// email address
// Create Getter For All
// Create Three Constructors
// 1)Constructors for all three field that assign
// 2)Constructors with no parameter but call other instructors with value
// 3)Constructors with name and email parameter which calls other constructor


public class S07_81_Constructor {
    

    private String name;
    private double creditLimit;
    private String email;

    //Constructors 
    public S07_81_Constructor(String name,double creditLimit,String email){//Constructor 1
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;

    }
    public S07_81_Constructor(){//Constructor 2
       this("Shivam","xyz@gmail.com");
    }
    public S07_81_Constructor(String name,String email){//Constructor 3
        this(name,1000,email);
    }




    //Getter Methods
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
    public static void main(String[] args) {
        S07_81_Constructor n = new S07_81_Constructor();
        System.out.println(n.getCreditLimit());
        System.out.println(n.getName());
        System.out.println(n.getEmail());
        
    }


}