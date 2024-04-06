import java.util.ArrayList;
import java.util.List;
public class Temp2 {
    // write code here
    public static String myNumber;
    public static ArrayList<Contact> myContacts;
    
    public Temp2(String myNumber ){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    
    public static boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }
    
    public static boolean updateContact(Contact contact2,Contact contact2 )
    {
            myContacts
        if(contact1.equals(contact2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Temp2 temp = Temp2("Shivam Thakur");
    }
    
    


}




