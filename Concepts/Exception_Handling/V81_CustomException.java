
public class V81_CustomException {
    public static void main(String[] args) {
        int j = 30;
        int i = 80;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new ShivamException("This is my exception");
            }
        } catch (ShivamException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ShivamException extends Exception {
    public ShivamException(String s) {
        super(s);
    }
}
