package Concepts.Generics_Example;

/*
        Youtube Video 
        Title            :   Generics with wildcard in java 
        Link             :   https://youtu.be/Xje5PIhys18?si=Vhz_TRNOYbZrLEfk
        Optional 
        Study Material   : https://www.javatpoint.com/generics-in-java
        Rating           :   10 / 10 
 */

import java.util.ArrayList;
import java.util.List;


public class Application {
    
    public static void main(String[] args) {
        

        Object myObject = new Object();

        String myVar = "Hello";

        myObject = myVar;

        



        Employee emp = new Employee("Akshay");
        Accountant acc = new Accountant("Shivam");

        emp = acc;

        ArrayList <Employee> employees = new ArrayList<>();
        ArrayList <Accountant> accountants = new ArrayList<>();

        // employees = accountants;     // InList Object Datatype =/ String 


        ArrayList <?> employee2 = new ArrayList<>();    // Ray Type
        ArrayList <Accountant> accountant2 = new ArrayList<>();

        employee2 = accountant2;


        // also work with interface 
        ArrayList <? extends Employee> employee3 = new ArrayList<>();   // For 
        ArrayList < Accountant > accountant3 = new ArrayList<>();
        // ArrayList < Object > accountant3 = new ArrayList<Object>();
        // ArrayList < String > accountant3 = new ArrayList<>();

        employee3 = accountant3;


        ArrayList < ? super Employee > employee4 = new ArrayList<>();
        // ArrayList<Accountant> accountant4 = new ArrayList<>();
        ArrayList<Object> accountant4 = new ArrayList<>();
        employee4 = accountant4;

        employees.add(new Employee("Suresh"));
        employees.add(new Employee("Binay"));

        makeEmployeeWork(employees);
        

        accountants.add(new Accountant("Barun"));
        accountants.add(new Accountant("Aashutosh"));
        
        makeEmployeeWork(accountants);

        makeEmployeeSleep(accountants);


        ArrayList<HRManager> hrManagers = new ArrayList<>();
        hrManagers.add(new HRManager("Binayak"));
        hrManagers.add(new HRManager("Pushkar"));
        makeEmployeeEat(hrManagers);

    }

        public static void makeEmployeeWork(List<? extends Employee> employees)
        {
            for(Employee e : employees)
            {
                e.work();
            }
        }




        public static void makeEmployeeSleep(List<? extends Employee> employees)
        {
            for(Accountant e : (ArrayList<Accountant>) employees)
            {
                e.sleep();
            }
        }




        public static void makeEmployeeEat(List<? extends Employee> employees)
        {
            for(HRManager e : (ArrayList<HRManager>) employees)
            {
                e.eat();
            }
        }







}



