public class Main {

    public static void main(String[] args) {

        MyIntegerClass a = new MyIntegerClass(1);
        MyCharacterClass b = new MyCharacterClass('@');
        MyFloatClass c = new MyFloatClass(2.063f);
        MyStringClass d = new MyStringClass("Playboy Carti");


        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(c.getValue());
        System.out.println(d.getValue());
       
    
    }
    
}
