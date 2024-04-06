public class S06_60_Interest {
    public static void main(String[] args) {
        for(double i =7.5;i<=10.0;i=i+0.25){
            double InterestAmount = calculateInterest(100.00, i);

            // We Can Also Use Break Statement In the Loop Statements And It Will Work The Same As That Of the Switch Statement
          
            // if(i>8.25){
            //     break;
            // }
            // if(InterestAmount>8.25){
            //     break;
            // }

          System.out.println("$100.00 at "+ i + "% interest = $" +InterestAmount);

        }
    }

    public static double calculateInterest(double Amount ,double InterestRate) {

        return (Amount * (InterestRate /100));
    }
}