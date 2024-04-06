package EX21_40.S07_99_EX36;

public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(double radius,double height){
        super(radius);
        if(height<0){
        this.height=0;
    }else{
        this.height=height;
    }
    }
     public double getHeight(){
    return this.height;
}
public double getVolume(){
    return ((super.getArea())*height);
}
}
