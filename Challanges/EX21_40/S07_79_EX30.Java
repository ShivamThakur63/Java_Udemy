public class S07_79_EX30 {
    // write code here
    private double firstNumber;
    private double secondNumber;
    
    
      public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult(){
        return (firstNumber + secondNumber);
    }
    
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }
    
    public double getDivisionResult(){
        if(this.getSecondNumber()==0){
            return 0;
        }
        return (firstNumber/secondNumber);
    }
}