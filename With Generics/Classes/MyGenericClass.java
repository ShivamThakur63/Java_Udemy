
public class MyGenericClass <Thing1 extends Number,Thing2>      // First Must be a number 
{   
        Thing1 x ;
        Thing2 y ;
    
    
       public MyGenericClass(Thing1 x,Thing2 y)
       {
        this.x = x;
        this.y = y;
       }
    
    
    
       public Thing2 getValue()
       {
        return y;
       }
    
    
    }
