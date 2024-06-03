package Concepts.Exception_Handling;

/*
 
Create a Java program that defines a custom exception NegativeWithdrawalException 
to handle scenarios where a user tries to withdraw a negative amount from their bank account. 
Implement methods to withdraw and deposit money into the account, using the throw and throws keywords appropriately. 
Ensure to handle the exceptions in the main method.

 */

class NegativeWithdrawalException extends Exception {
    public NegativeWithdrawalException(String s) {
        super(s);
    }

}

class NegativeDepositException extends Exception {
    public NegativeDepositException(String s) {
        super(s);
    }

}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String s) {
        super(s);
    }

}

public class Exercise_Banking {

    int total;

    public Exercise_Banking(int total) {
        this.total = total;
    }

    

    public void deposit(int sum) throws NegativeDepositException{

        if (sum < 0) {
            throw new NegativeDepositException("Deposit amount cannot be negative.");
        } else {
            this.total += sum;
            System.out.println("Deposited Amount : "+sum);
        }
    }

    public void withdraw(int sum) throws NegativeWithdrawalException,InsufficientFundsException {

        if (sum < 0) {
            throw new NegativeWithdrawalException("Withdrawal amount cannot be negative.");
        }

        if (sum > total) {
            throw new InsufficientFundsException("Insufficient funds.");

        } else {
            this.total -= sum;
            System.out.println("Withdrawl Amount : " + sum);
        }
    }

    public void display()
    {
        System.out.println("Total Amount : "+total);
    }


    public static void main(String[] args) {

        Exercise_Banking a = new Exercise_Banking(20000);
        try{
            a.deposit(2000);
            a.deposit(-200);
            a.withdraw(400);
            a.withdraw(-800);
        }catch(NegativeDepositException e)
        {
            System.out.println(e);
        }
        catch(InsufficientFundsException f)
        {
            System.out.println(f.getMessage());
        }catch(NegativeWithdrawalException g)
        {
            System.out.println(g.getMessage());
        }

          a.display();
        
        }


}
