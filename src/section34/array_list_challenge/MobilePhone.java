package section34.array_list_challenge;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName())>=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int findPosition = findContact(oldContact);
        if(findPosition<0){
            System.out.println(oldContact.getName()+", was not found.");
            return false;
        }else if(findContact(newContact.getName())!=-1){
            System.out.println("Contact with name " +newContact.getName()+" already exists. Update was not successful");
            return false;
        }
        this.myContacts.set(findPosition, newContact);
        System.out.println(oldContact.getName()+", was replaced by "+newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+", was removed");
        return true;
    }

    private int findContact(String contactName) {
        Contact contactToFind = myContacts
                .stream()
                .filter(contact -> contact.getName().equals(contactName))
                .findFirst().orElse(null);
        if (contactToFind!=null){
            return findContact(contactToFind);
        }else {
            return -1;
        }
    }

    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact list: \n");
        for (int i=0; i<myContacts.size();i++){
            System.out.printf("\t %d. %s : %s \n", i+1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
//        myContacts.forEach((contact) -> {
//            System.out.println(contact.getName()+" : "+contact.getPhoneNumber());
//        });
    }
}