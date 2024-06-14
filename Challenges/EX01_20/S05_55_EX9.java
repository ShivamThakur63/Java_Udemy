package EX01_20;



public class S05_55_EX9 {
    // write code here
    public static double area(double radius){
        if(radius <0){
            
            return -1.0;
        }
        double Area = Math.PI* (radius*radius);
        return Area;
    }
     public static double area(double x,double y){
         if(x<0 || y<0){
             return -1.0;
         }
         double area = (x * y);
         return area;
    
}
public static void main(String[] args) {
    System.out.println(area(32));
    System.out.println(area(73.7373));
    System.out.println(area(-2));
    System.out.println(area(3,4));
    System.out.println(area(43,32));
}

    
}
