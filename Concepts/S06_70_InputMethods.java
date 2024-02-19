public class S06_70_InputMethods {
    public static void main(String[] args) {

        //Small Example Of System.console 
        System.out.println("Hi,What's Your Name ?");

        //What This Will Do Is It Will Print The readLine Statement And Then Will Ask Us For Input
        String name = System.console().readLine("Better Not be Deez Nut's , ");
        System.out.println("Thank God");
        System.out.println("Hello "+ name);

        //Lets try Some User Interactive Things

        int CurrentYear =2023;
        String YearOfBirth = System.console().readLine("What Year Were You Born ");

        int age = CurrentYear - Integer.parseInt(YearOfBirth);

        System.out.println("So "+name+", You Are "+age+" Years Old");

    }
}
