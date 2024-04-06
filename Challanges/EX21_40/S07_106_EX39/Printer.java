package EX21_40.S07_106_EX39;


public class Printer {
    private int tonerLevel ;
    private int pagesPrinted;
    private boolean duplex;

    
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel=((tonerLevel<=100)&&(tonerLevel>=0))?tonerLevel:-1;
        this.duplex = duplex;
    }

  

    public int addToner(int tonerAmount) { //Doesnt Matter If We Write Else It Will Not Affect the Output 
        if(tonerAmount>0&&tonerAmount<=100){
            if((this.tonerLevel+tonerAmount)<=100){
             this.tonerLevel+=tonerAmount;
               return this.tonerLevel;
            }                       //So Add Else Or Not Here Doesnt Mean Shit
                return -1;
        }                           // " " " " " " 
            return -1;
    }


    public int printPages(int pages) {
        int pageCount = pages/2+pages%2;
        if(duplex){
            System.out.println("Its A Dupex Printer !!");
            this.pagesPrinted+=pageCount;
            return pageCount;
        }else{
            System.out.println("Its Not A Duplex Printer !!");
            this.pagesPrinted += pageCount;
            return pages;
        }
       
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
