package section34.array_list_challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 235 2647");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
//                    updateContact();
                    break;
                case 4:
//                    removeContact();
                    break;
                case 5:
//                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added : "+newContact.getName() + " phone number "+newContact.getPhoneNumber());
        }else {
            System.out.println("Cannot add : "+newContact.getName() + " already on file");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("\t 0 - to shutdown.");
        System.out.println("\t 1 - to print contacts.");
        System.out.println("\t 2 - to add new contact.");
        System.out.println("\t 3 - to update existing contact.");
        System.out.println("\t 4 - to remove an existing contact.");
        System.out.println("\t 5 - query if an existing contact exists.");
        System.out.println("\t 5 - to print a list of available actions.");
        System.out.println("Choose your actions: ");
    }

}
