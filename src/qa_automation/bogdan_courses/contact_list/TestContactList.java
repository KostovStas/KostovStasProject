package qa_automation.bogdan_courses.contact_list;

/**
 * Created by mac on 7/14/17.
 */
public class TestContactList {

    public static void main(String[] args) {


        Contact contact1 = new Contact("Stas1","Petrov", 80979642054L,"Kiev","Life");
        Contact contact2 = new Contact("Stas2","Petrov", 80979642054L,"Kiev","Life");
        Contact contact3 = new Contact("Stas3","Petrov", 80979642054L,"Kiev","Life");
        Contact contact4 = new Contact("Stas4","Petrov", 80979642054L,"Kiev","Life");
        Contact contact5 = new Contact("Stas5","Petrov", 80979642054L,"Kiev","Life");

        ContacList contacList = new ContacList();

        contacList.addContact(contact1);
        contacList.addContact(contact2);
        contacList.addContact(contact3);

        contacList.showAllContacts();

        System.out.println("----");
        contacList.findContactByFirstName("123123");











    }
}
