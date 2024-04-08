

 // All This 50 Line Of Code Just For What Retriving a data . So,We Will Use Record 
 // All This Method is Already Included in Record
 // If we Want To change something like adding a default constructor we can do it in the code block of record
 // All This variable inside the record is considered private & final so you cant change that so not setterMetod
 // It cannot extend any other class as it already extends Record Class 
 // You can Add as many interfaces as you want 
 // Can add as many method as you want 
 // You can add static variable but cannot add instace variable to it directly do include it as parameters 
 // Getting a variable is easy not setter  no problem only .name()


record Laptop(String model,int price)
 {
    public Laptop() {
    this("School Laptop", 30000); 
    }

    public Laptop(String model , int price){        // Canonical Constructor
        // Why Would We Even Do that 
        // --> To Throw and check somethings like an exception
        if(price<20000){
            throw new IllegalArgumentException("Not For Coding & Gaming ");
        }

        this.model =model;
        this.price = price;
        
    }

    // public Laptop        // Compact Canonical Constructor 
    // {       
    //     if(price<20000){
    //         throw new IllegalArgumentException("Not For Coding & Gaming ");
    //     }
        
    // }
 } 

 /* public class Laptop
{
    private final String model;
    private final int price;


    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }

    public Laptop(String model , int price )
    {
        this.model = model;
        this.price = price;
        
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Laptop [ model = " + model + ", price = " + price + "]";
    }
    
    
    
}
*/
class Main
{
    public static void main(String[] args)
    {
        Laptop lap1 = new Laptop("Macbook Air M1", 69000);
        Laptop lap2 = new Laptop("Dell XPS", 100000);
        Laptop lap3 = new Laptop("Macbook Air M1", 69000);
        Laptop lap4 = new Laptop();

        System.out.println(lap1);
        System.out.println(lap2);
        System.out.println(lap4);

        System.out.println(lap1.equals(lap3));  // Overriding .equals Method
    }
}