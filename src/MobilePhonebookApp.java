import java.util.ArrayList;
import java.util.Scanner;

    public class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    class Phonebook {
        private ArrayList<Contact> contacts;

        public Phonebook() {
            this.contacts = new ArrayList<>();
        }

        public void insertContact(String name, String phoneNumber) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
        }

        public Contact searchContact(String name) {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    return contact;
                }
            }
            return null;
        }

        public void displayContacts() {
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
            }
        }

        public String deleteContact(String name) {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    contacts.remove(contact);
                    return "Contact deleted";
                }
            }
            return "Contact not found";
        }

        public String updateContact(String name, String updatedName, String updatedPhoneNumber) {
            for (Contact contact : contacts) {
                if (contact.getName().equals(name)) {
                    contact.setName(updatedName);
                    contact.setPhoneNumber(updatedPhoneNumber);
                    return "Contact updated";
                }
            }
            return "Contact not found";
        }
    }

     class Main {
        public static void main(String[] args) {
            Phonebook phonebook = new Phonebook();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Insert Contact");
                System.out.println("2. Search Contact");
                System.out.println("3. Display all contacts");
                System.out.println("4. Delete Contact");
                System.out.println("5. Update Contact");
                System.out.println("6. Quit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        phonebook.insertContact(name, phoneNumber);
                        break;
                    case 2:
                        System.out.print("Enter name to search: ");
                        name = scanner.nextLine();
                        Contact contact = phonebook.searchContact(name);
                        if (contact != null) {
                            System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
                        } else {
                            System.out.println("Contact not found");
                        }
                        break;
                    case 3:
                        phonebook.displayContacts();
                        break;
                    case 4:
                        System.out.print("Enter name to delete: ");
                        name = scanner.nextLine();
                        System.out.println(phonebook.deleteContact(name));
                        break;
                    case 5:
                }
            }}}