package com.infogalaxy.addressbook;


import java.util.Scanner;

public class Addressbook {

    static Scanner scanner = new Scanner(System.in);
    Contact contact = new Contact();

    public void addcontact() {
        System.out.println("Enter The First Name:-");
        contact.setFirstname(scanner.next());
        System.out.println("Enter The Last Name:-");
        contact.setLastname(scanner.next());
        System.out.println("Enter The Address:-");
        contact.setAddress(scanner.next());
        System.out.println("Enter The City:-");
        contact.setCity(scanner.next());
        System.out.println("Enter The state:-");
        contact.setState(scanner.next());
        System.out.println("Enter The Phone Number:-");
        contact.setPhonenumber(scanner.next());
        System.out.println("Enter The Email-Id:-");
        contact.setEmail(scanner.next());
    }

    public void showcontact() {
        try {
            System.out.println(contact.toString());
        } catch (NullPointerException ne) {
            System.out.println("Contact Not Exist.");
        }
    }

    public void editcontact() {
        System.out.println("Enter The First Name:-");
        String name = scanner.next();

        if (name.equalsIgnoreCase(contact.getFirstname())) {
            System.out.println("Contact Found");
            System.out.println("Enter The Last Name:-");
            contact.setLastname(scanner.next());
            System.out.println("Enter The Address:-");
            contact.setAddress(scanner.next());
            System.out.println("Enter The City:-");
            contact.setCity(scanner.next());
            System.out.println("Enter The state:-");
            contact.setState(scanner.next());
            System.out.println("Enter The Phone Number:-");
            contact.setPhonenumber(scanner.next());
            System.out.println("Enter The Email-Id:-");
            contact.setEmail(scanner.next());
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public void deleteContact() {
        System.out.println("Enter the First Name to Delete the Contact :");
        String name = scanner.next();
        if (name.equalsIgnoreCase(contact.getFirstname())) {
            System.out.println("Contact Found.");
            contact = null;
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void main(String[] args) {
        int choice;

        Addressbook addressbook = new Addressbook();
        do {
            System.out.println("***ADDRESS BOOK MANAGER ***");
            System.out.println("1. ADD NEW CONTACT \n 2. EDIT CONTACT \n 3. DISPLAY CONTACT \n 4. DELETE CONTACT \n 5. EXIT");
            System.out.println("Enter Your Choice :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressbook.addcontact();
                    break;
                case 2:
                    addressbook.editcontact();
                    break;
                case 3:
                    addressbook.showcontact();
                    break;
                case 4:
                    addressbook.deleteContact();
                    break;
            }
        } while (choice != 5);

    }
}
