import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        contacts.printMenuOptions();
        int choice;
        boolean exit = false;

        while(!exit) {
            System.out.println("Enter Menu Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    contacts.printMenuOptions();
                    break;
                case 1:
                    contacts.displayContacts();
                    break;
                case 2:
                    contacts.addContact();
                    break;
                case 3:
                    contacts.updateContact();
                    break;
                case 4:
                    contacts.removeContact();
                    break;
                case 5:
                    contacts.searchContact();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }

    }

}
