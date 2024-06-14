package EX21_40;
public class S07_87_EX35 {
    // write code here
    private double real;
    private double imaginary;
    
    // Constructor
    public S07_87_EX35(double real , double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    
     public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    
    public void add(double real,double imaginary){
        this.real += real;
        this.imaginary += imaginary ;
    }

     public void add(S07_87_EX35 a){
         
          add(a.real,a.imaginary);
    }
    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(S07_87_EX35 b){
        subtract(b.real,b.imaginary);
    }
}

    

    
    
    
    
    
