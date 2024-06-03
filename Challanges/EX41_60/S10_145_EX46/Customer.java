package S10_145_EX46;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    
    // Constructor 
    public Customer(String name,double initialTransaction)
    {
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }
    
    // Getter For Name 
    public String getName()
    {
        return this.name;
    }
    
    // Getter For Transactions
    public ArrayList<Double> getTransactions()
    {
        return this.transactions;
    }
    
    public void addTransaction(double transaction)
    {
        transactions.add(transaction);
    }
}