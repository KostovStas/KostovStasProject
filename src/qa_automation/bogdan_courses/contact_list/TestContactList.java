package qa_automation.bogdan_courses.contact_list;

/**
 * Created by mac on 7/14/17.
 */
public class TestContactList {

    public static void main(String[] args) {


        User user1 = new User("Stas","Petrov", 80979642054L,"Kiev","Life");
        User user2 = new User("Sveta", 80979642054L,"Life");
        User user3 = new User("Marina1", 80979642054L,"Life");
        User user4 = new User("Marina2", 80979642054L,"Life");
        User user5 = new User("Marina3", 80979642054L,"Life");
        User user6 = new User("Marina4", 80979642054L,"Life");
        User user7 = new User("Marina5", 80979642054L,"Life");
        User user8 = new User("Marina6", 80979642054L,"Life");
        User user9 = new User("Marina7", 80979642054L,"Kiyvstar");
        User user10 = new User("Marina8", 80979642054L,"Life");

        ContacList contacList = new ContacList("Contacts");


        contacList.addUserToContactList(user1);
        contacList.addUserToContactList(user2);
        contacList.addUserToContactList(user3);
        contacList.addUserToContactList(user4);
        contacList.addUserToContactList(user5);
        contacList.addUserToContactList(user6);
        contacList.addUserToContactList(user7);
        contacList.addUserToContactList(user8);
        contacList.addUserToContactList(user9);
        contacList.addUserToContactList(user10);

        contacList.showLifeContacts();



       /* contacList.showAllContacts();

        contacList.removeLastUserInToContactList();


       /* System.out.println("---------");
        contacList.showAllContacts();*//*
        contacList.showAllContacts();
        System.out.println("-------");
        contacList.removeLastUserInToContactList();
        contacList.showAllContacts();
        System.out.println("-------");
         contacList.removeContactbyNameAndPhoneNumber("Marina1",80979642054l);
        //contacList.showAllContacts();*/






    }
}
