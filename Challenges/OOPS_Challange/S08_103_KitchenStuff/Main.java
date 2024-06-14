package Challenges.OOPS_Challange.S08_103_KitchenStuff;

public class Main {
    
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
    
}
