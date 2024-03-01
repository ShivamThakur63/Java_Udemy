package S07_113_OOPsMaster;

public class Burger {
    
    private String type;
    private double price;
    private int topping = 3;
    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public void addTopping(int topping){
        this.topping+=topping;
    }

}
