package Challenges.EX21_40.S07_106_EX39;

public class Main {
    public static void main(String[] args) {
        String e1="greeting";
        //String e2="greeting";
        if(e1=="greeting"){
            System.out.println("Bonjour");
        }
        Printer printer=new Printer(50,true);
        System.out.println("Initial Page Count "+ printer.getPagesPrinted());
        printer.addToner(200);

        int pagesPrinted=printer.printPages(5);
        System.out.printf("""
                Current Job Pages : %d,
                Printer Total :%d %n
                """,pagesPrinted,printer.getPagesPrinted());


        pagesPrinted=printer.printPages(5);
        System.out.printf("""
        Current Job Pages : %d,
        Printer Total :%d %n
        """,pagesPrinted,printer.getPagesPrinted());
    }
    
}
