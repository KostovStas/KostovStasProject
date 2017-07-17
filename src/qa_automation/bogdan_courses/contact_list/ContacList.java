package qa_automation.bogdan_courses.contact_list;
import java.util.ArrayList;


public class ContacList {

    private String name;

    ArrayList<User> listOfContacts = new ArrayList<>();


    public ContacList(String name) {

    }

    public void addUserToContactList(User someUser) {

        listOfContacts.add(someUser);

    }

    public void removeLastUserInToContactList() {

        listOfContacts.remove(listOfContacts.get(listOfContacts.size() - 1));
    }

    public void showAllContacts() {

        for (int i = 0; i < listOfContacts.size(); i++) {

            System.out.println(listOfContacts.get(i));

        }
    }


    public void findContactByFirstName(String firstName) {


        boolean isFound = false;

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (firstName.equalsIgnoreCase(listOfContacts.get(i).getFirstName())) {

                System.out.println(listOfContacts.get(i).toString());

                isFound = true;

            }
        }

        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void findContactBySecondName(String secondName) {

        boolean isFound = false;

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (secondName.equalsIgnoreCase(listOfContacts.get(i).getSecondName())) {

                System.out.println(listOfContacts.get(i));

                isFound = true;
            }

        }

        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void findContactByPhoneNumber(long phoneNumber) {

        boolean isFound = false;

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (listOfContacts.get(i).getPhoneNumber() == phoneNumber) {

                System.out.println(listOfContacts.get(i));
                isFound = true;
            }
        }

        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void findContactByAddress(String address) {


        boolean isFound = false;

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (listOfContacts.get(i).getAddress().equalsIgnoreCase(address)) {

                System.out.println(listOfContacts.get(i));
                isFound = true;

            }
        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void removeContactbyNameAndPhoneNumber(String firstName, long phoneNumber) {

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (listOfContacts.get(i).getFirstName().equalsIgnoreCase(firstName)
                    && listOfContacts.get(i).getPhoneNumber() == phoneNumber) {

                listOfContacts.remove(i);
                System.out.println("Contac was deleted");
                break;
            }


        }

    }


    // update only names

    public void updateContactInfo(User user1, String newFirstName, String newSecondName) {

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (listOfContacts.contains(user1)) {
                user1.setFirstName(newFirstName);
                user1.setSecondName(newSecondName);
            }
        }

    }


    public void showFirstFiveContacts() {

        for (int i = 0; i < listOfContacts.size(); i++) {

            System.out.println(listOfContacts.get(i));

            if (i == 4) {
                break;
            }

        }
    }

    public void showLastFiveContacts() {

        int j = 5;
        for (int i = listOfContacts.size(); i > 0; i--) {

            System.out.println(listOfContacts.get(i - 1));

            j--;
            if (j == 0) {
                break;
            }

        }
    }


    public void showLifeContacts() {

        boolean isFound = false;

        for (int i = 0; i < listOfContacts.size(); i++) {

            if (listOfContacts.get(i).getTelephoneOperator().equalsIgnoreCase("life")) {

                System.out.println(listOfContacts.get(i));

                isFound = true;
            }

        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }


    public void showKiyvstarContacts (){


        boolean isFound = false;

        for (int i = 0; i <listOfContacts.size() ; i++) {

            if (listOfContacts.get(i).getTelephoneOperator().equalsIgnoreCase("Kiyvstar")){

                System.out.println(listOfContacts.get(i));

                isFound = true;
            }

        }


        if (isFound == false) {

            System.out.println("No matches found ");
        }
    }

}
