package Challenges.EX41_60.S10_136_EX44;


import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        for (Contact myContact : myContacts) {
            if (myContact.getName().equals(contact.getName())) {
                return false;
            }
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int temp = myContacts.indexOf(oldContact);
        if (temp >= 0) {
            myContacts.set(temp, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact removableContact) {
        if (myContacts.contains(removableContact)) {
            myContacts.remove(removableContact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contactToFind) {
        int temp = myContacts.indexOf(contactToFind);

        return temp;
    }

    private int findContact(String contactToFind) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact temp = myContacts.get(i);
            if (temp.getName().equals(contactToFind)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact temp = myContacts.get(i);
            if (temp.getName().equals(contact)) {
                return temp;
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String number = myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1) + ". " + name + " -> " + number);
        }
    }

}
