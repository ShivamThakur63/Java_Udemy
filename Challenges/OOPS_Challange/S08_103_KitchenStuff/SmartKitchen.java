package OOPS_Challange.S08_103_KitchenStuff;

  
 public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

public void setKitchenState(boolean coffeeFlag,boolean RefrigeratorFlag,boolean dishWasherFlag){
    brewMaster.setHasWorkToDo(coffeeFlag);
    iceBox.setHasWorkToDo(RefrigeratorFlag);
    dishWasher.setHasWorkToDo(dishWasherFlag);
}

public void doKitchenWork(){
    brewMaster.brewCoffee();
    iceBox.orderFood();
    dishWasher.doDishes();

}


}
//Coffee Maker
class CoffeeMaker {
    
    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo==true){
            System.out.println("Brewing Coffee For Steve Jobs Late Night Shift !!");
           hasWorkToDo=false;
        }
    }

}



//Refrigator Class

class Refrigerator {
    
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    //For Pouring Milk
    public void orderFood(){
        if(hasWorkToDo==true){
            System.out.println("Preparing Food For Torrento's Family !!");
            hasWorkToDo=false;
        }
    }

}


//Dishwasher Class

class DishWasher {
    private boolean hasWorkToDo;
    
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

  
    //For Loading Dishwasher
    public void doDishes(){
        if(hasWorkToDo==true){
            System.out.println("Mia is Cleaning Cooking Utensils And Plates For Brian !!");
            hasWorkToDo=false;
        }
    }

}
