package EX21_40.S07_103_EX38;


public class Bed{
    // write code here
    private String style;
    private int pillow;
    private int height;
    private int quilt;
    private int sheets;
    
    public Bed(String style,int pillow,int height,int sheets,int quilt){
        this.style=style;
        this.pillow=pillow;
        this.height=height;
        this.sheets=sheets;
        this.quilt=quilt;
    }
    public void make(){
        System.out.println("Bed -> Making | ");
    }
    public String getStyle(){
        return this.style;
    }
    public int getSheets(){
        return this.sheets;
    }
     public int getPillow(){
        return this.pillow;
    }
     public int getHeight(){
        return this.height;
    }
     public int getQuilt(){
        return this.quilt;
    }
}





