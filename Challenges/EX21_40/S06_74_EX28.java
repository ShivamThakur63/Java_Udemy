package EX21_40;

    

import java.util.Scanner;

public class S06_74_EX28 {
    
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            
            String input = sc.nextLine();

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException badValue) {
                break;
            }
        }

        if (count >= 0) {
            long avg = Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        } 
        sc.close();
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
