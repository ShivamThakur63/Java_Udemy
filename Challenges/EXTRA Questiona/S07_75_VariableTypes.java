public class S07_75_VariableTypes {

    int b = 40;// Instance Variable
    // Can Be Accessed Outside The Program As Well
    // Can Be Used Only After Creating An Object First

    static int c = 60;// Static Variable
    // Has Access Throughout the Program

    public static void main(String[] args) {
        S07_75_VariableTypes d = new S07_75_VariableTypes();
        int a = 20;// Local Variable
        // Only Has Access Within That Method
        // Only Remembers Value For The Method Temporarily as long As You Are Out The
        // Method The Memory Gets Deleted

        System.out.println(a);
        d.fun();
        //we needed to make object because b is an instance variable and it needs an object
        d.fun();
        //fun() Noo Because Fun Is Alredy An Instance Function
    }

    /* For Example */
    void fun() {
        int d = 80;
        System.out.println(b + " " + c + " " + d + " ");// 40,60,80 and 41,61,80
        // Value Of d Didn't Change Because Our Variable d is widthin a method and is a
        // local variable so value of it resets to its original form
        b++;
        c++;
        d++;
    }

}
