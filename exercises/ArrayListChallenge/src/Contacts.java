import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    private static ArrayList<String> contacts = new ArrayList<String>();
    private static ArrayList<Long> numbers = new ArrayList<Long>();

    private Scanner scanner = new Scanner(System.in);

    public void printMenuOptions() {
        System.out.println("Menu Options: ");
        System.out.println("\t0 - Display Menu Options");
        System.out.println("\t1 - Show Contacts");
        System.out.println("\t2 - Add Contact");
        System.out.println("\t3 - Update Contact");
        System.out.println("\t4 - Remove Contact");
        System.out.println("\t5 - Find Contact");
        System.out.println("\t6 - Exit Menu");

    }

    public void displayContacts() {
        if(contacts.size() == 0) {
            System.out.println("No Contacts");
        }
        else {
            System.out.println("Contacts");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("Name: " + contacts.get(i));
                System.out.println("Number: " + numbers.get(i) + "\n");
            }
        }
    }

    public void addContact() {
        System.out.println("Enter Contact Name: ");
        String name = scanner.nextLine();
        if(findContact(name) < 0) {
            System.out.println("Enter Contact Number: ");
            System.out.println("Example: 1234567891");
            long number = scanner.nextLong();
            scanner.nextLine();
            if(findContact(number) < 0) {
                contacts.add(name);
                numbers.add(number);

                System.out.println("'" + name + " : " + number + "' Added to Contacts");
            }
            else {
                System.out.println("Contact Number Already Exists");
            }
        }
        else {
            System.out.println("Contact Name Already Exists");
        }

    }

    public void addContact(String name) {
        System.out.println("Storing Name, Enter Contact Number");
        System.out.println("Example: 1234567891");
        long number = scanner.nextLong();
        scanner.nextLine();
        contacts.add(name);
        numbers.add(number);

        System.out.println("'" + name + " : " + number + "' Added to Contacts");
    }

    public void updateContact() {
        System.out.println("Enter Contact Name to Update");
        String name = scanner.nextLine();
        if(findContact(name) >= 0) {
            System.out.println("Enter New Number for " + name);
            long number = scanner.nextLong();
            scanner.nextLine();

            numbers.add(findContact(name), number);
        }
        else {
            System.out.println("Contact Does Not Yet Exist, Creating Contact");
            addContact(name);
        }

    }

    public void removeContact() {
        System.out.println("Enter Contact Name to Remove");
        String name = scanner.nextLine();
        long number = numbers.get(findContact(name));

        contacts.remove(findContact(name));
        numbers.remove(findContact(number));

        System.out.println("Contact '" + name + " : " + number + "' Removed from Contacts");

    }

    private int findContact(String name) {
        return contacts.indexOf(name);
    }

    private int findContact(long number) {
        return numbers.indexOf(number);
    }

    public void searchContact() {
        System.out.println("Search Contacts:");
        String name = scanner.nextLine();
        if(findContact(name) >= 0) {
            System.out.println("Contact '" + name + "' exists");
        }
        else {
            System.out.println("Contact '" + name + "' does not exist");
        }

    }

}