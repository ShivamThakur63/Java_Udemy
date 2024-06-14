package Challenges.EX01_20;


public class S06_69_EX19 {
    // write code here

    public static boolean hasSharedDigit(int Number1, int Number2) {
        int remainder = 0;
        int remainder2 = 0;
        int temp = Number2;
        if (((Number1 >= 10) && (Number1 <= 99)) && ((Number2 >= 10) && (Number2 <= 99))) {

            while (Number1 >= 1) {

                remainder = Number1 % 10;
                Number1 /= 10;

                while (temp >= 1) {

                    remainder2 = temp % 10;
                    temp = temp / 10;

                    if (remainder == remainder2) {
                        return true;
                    }
                }

                temp = Number2;

            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 18));
    }
}