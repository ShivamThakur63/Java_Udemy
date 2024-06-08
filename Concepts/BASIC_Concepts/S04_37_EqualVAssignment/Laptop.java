package Concepts.BASIC_Concepts.S04_37_EqualVAssignment;

public class Laptop {
    String model;
    int price;

    public Laptop(String model, int price) {
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

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptop other = (Laptop) obj;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }


    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price==that.price){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

}

class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Macbook Air M1", 69000);
        Laptop lap2 = new Laptop("Macbook Air M2", 90000);
        Laptop lap3 = new Laptop("Macbook Air M1", 69000);

        // No Overriding of .toString Method --> Laptop@626fdcc7 (HashCodes)
        // Overriding of .toString Method --> Laptop [model=Macbook Air M1, price=69000]

        /*
         * But Why ?
         * HashCode : Single String of all the data you have 
         * HashCode is the combination of all the variable mixed into one code for figuring ot the object easily.
         * Hash codes are used in hash-based data structures like HashMap to quickly locate objects in collections.
         */
        System.out.println(lap1);

        System.out.println(lap1 == lap2);
        // No Overriding .equals Method --> False
        // Overriding .equals Method --> True

        /*
         * .equals() primarly cheaks if the hashcode of two objects are same or not not
         * the element since we use new Keyword their hashcode changes for obvious
         * reason because both are two different object and are pointing at two
         * different objects
         * 
         * So Thats why we change and override to cheak the contents of the two objects rather than their hashcode
         */
        System.out.println(lap1.equals(lap2));
        System.out.println(lap1.equals(lap3));

    }
}
