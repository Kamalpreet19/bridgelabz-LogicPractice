import java.util.*;

class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void showDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}

interface AddressBookOperations {
    void addContact();
    void showContacts();
    void editContactByName();
    void deleteContact();
}

public class AddressBookkOops implements AddressBookOperations {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            System.out.print("Enter Zip: ");
            String zip = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Contact contact = new Contact(
                    firstName, lastName, address,
                    city, state, zip, phone, email
            );

            contacts.add(contact);
            System.out.println("Contact Added Successfully!");

            System.out.print("Do you want to add another account?(Y/N): ");
            choice = sc.nextLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }

        for (Contact c : contacts) {
            c.showDetails();
        }
    }

    public void editContactByName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name to Edit: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("Enter New Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("Enter New City: ");
                c.setCity(sc.nextLine());

                System.out.print("Enter New State: ");
                c.setState(sc.nextLine());

                System.out.print("Enter New Zip: ");
                c.setZip(sc.nextLine());

                System.out.print("Enter New Phone Number: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("Enter New Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact Updated Successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found!");
        }
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name to Delete: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("Contact Deleted!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");

        AddressBookOperations obj = new AddressBook();
        int choice;

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Show Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    obj.addContact();
                    break;
                case 2:
                    obj.showContacts();
                    break;
                case 3:
                    obj.editContactByName();
                    break;
                case 4:
                    obj.deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting Address Book...");
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 5);
    }
}
