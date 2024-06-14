import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customer;


    public Bank(String name) {
        this.name = name;
        customer = new ArrayList<>();
    }


    // Finding Customer 
    public Customer findCustomer(String name)
    {
        for(Customer i : customer)
        {
            if(i.name().equals(name))
            {
                return i;
            }
        }
        System.out.println("Customer --> "+name+" Not Found. ");
        return null;
    }


    // Adding Customer 
    public void addCustomer(Customer x)
    {
        Customer y = findCustomer(x.name());
        if(y==null)
        {
            customer.add(x);
        }
    }


     // Modifying ToString Method
    @Override
    public String toString() {
        return "Bank [name=" + name + ", customer=" + customer + "]";
    }

    // Adding Transaction 
    public void addTransaction(String name , double amount)
    {
        Customer y = findCustomer(name);
        if(y!=null)
        {
            y.transactions().add(amount);
        }
    }

    // Printing The Detailed Information of Customer
    public void printDetail(String name)
    {
        Customer y = findCustomer(name);
        if(y!=null)
        {
            System.out.println("-".repeat(36));
            System.out.println("Name : "+name);
            for(double i : y.transactions())
            {
                System.out.printf("$%7.2f (%s)%n",i,i<0?"debit":"credit");
            }
        }
    }

   
    
}

record Customer(String name, ArrayList<Double> transactions) {

    // Create new customer 
    public Customer(String name, double initialDeposit) 
    {
        this(name, new ArrayList<>(30)); // If its fix that we will have x number of transaction we can just set it
        transactions.add(initialDeposit);
    }

    
}


class Main{
    public static void main(String[] args) {
        Customer bob = new Customer("J Bob", 1000.0);
        System.out.println(bob);
        Bank bank = new Bank("chase");
        bank.addCustomer(bob);
        bank.addCustomer(new Customer("Jane A", 500.0));
        System.out.println(bank);
        bank.addTransaction("Jane A", 250.0);
        bank.addTransaction("Jane A", -179);
        bank.addTransaction("Jane A", -379);
        bank.printDetail("Jane A");
        System.out.println(bank);
    }
}