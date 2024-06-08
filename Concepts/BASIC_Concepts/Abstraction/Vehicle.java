package Concepts.BASIC_Concepts.Abstraction;

public abstract class Vehicle 
{ 
    String manufacturer;
    int yearOfManufacture;
    
    public Vehicle(String manufacturer, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void turnOffLight(){
        System.out.println("Turning off light...");
    }
    public void turnOnLight(){
        System.out.println("Turning on light...");
    }
    
    
}
