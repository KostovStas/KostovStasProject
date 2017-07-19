package qa_automation.bogdan_courses.contact_list;

import java.util.ArrayList;


public class ContacList {

    private ArrayList<Contact> contacts = new ArrayList<>();


    public boolean addContact(Contact contact) {

        contacts.add(contact);
        return true;
    }

    public void removeLast() {

        if (contacts.size() > 0) {

            contacts.remove(contacts.get(contacts.size() - 1));

        } else {

            System.out.println("Your contact list is empty");
        }

    }


    public void showAllContacts() {


        for (Contact someContacts : contacts) {

            System.out.println(someContacts);

        }
    }


    public Contact findContactByFirstName(String firstName) {


        boolean isFound = false;

        Contact newContact = null;

        for (Contact c : contacts) {


            if (firstName.equalsIgnoreCase(c.getFirstName())) {

                isFound = true;

                newContact = c;

            }
        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }

        return newContact;
    }


    public void findContactBySecondName(String secondName) {
        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (secondName.equalsIgnoreCase(contacts.get(i).getSecondName())) {

                System.out.println(contacts.get(i));

                isFound = true;
            }
        }

        if (isFound == false) {
            System.out.println("No matches found ");
        }
    }


    public void findContactByPhoneNumber(long phoneNumber) {

        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == phoneNumber) {

                System.out.println(contacts.get(i));
                isFound = true;
            }
        }

        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void findContactByAddress(String address) {
        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getAddress().equalsIgnoreCase(address)) {
                System.out.println(contacts.get(i));
                isFound = true;
            }
        }

        if (isFound == false) {
            System.out.println("No matches found ");
        }
    }


    public void removeContactbyNameAndPhoneNumber(String firstName, long phoneNumber) {

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName)
                    && contacts.get(i).getPhoneNumber() == phoneNumber) {

                contacts.remove(i);
                System.out.println("Contac was deleted");
                break;
            }


        }

    }


    // update only names

    public void updateContact(Contact contact, String newFirstName, String newSecondName) {

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.contains(contact)) {
                contact.setFirstName(newFirstName);
                contact.setSecondName(newSecondName);
            }
        }

    }


    public void showFirstFiveContacts() {

        for (int i = 0; i < contacts.size(); i++) {

            System.out.println(contacts.get(i));

            if (i == 4) {
                break;
            }

        }
    }

    public void showLastFiveContacts() {

        int j = 5;
        for (int i = contacts.size(); i > 0; i--) {

            System.out.println(contacts.get(i - 1));

            j--;
            if (j == 0) {
                break;
            }

        }
    }


    public void showLifeContacts() {

        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getTelephoneOperator().equalsIgnoreCase("life")) {

                System.out.println(contacts.get(i));

                isFound = true;
            }

        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void showContacts(String type) {


        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getTelephoneOperator().equalsIgnoreCase(type)) {

                System.out.println(contacts.get(i));

                isFound = true;
            }

        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }

}
