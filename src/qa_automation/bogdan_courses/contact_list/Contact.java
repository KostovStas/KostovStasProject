package qa_automation.bogdan_courses.contact_list;


import java.util.Scanner;

public class Contact {


    private String firstName;
    private String secondName;
    private long phoneNumber;
    private String address;
    private String telephoneOperator;


    public Contact(String firstName, String secondName, long phoneNumber, String address, String telephoneOperator) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.telephoneOperator = telephoneOperator;
    }

    public Contact(String firstName, long phoneNumber, String telephoneOperator) {

        firstName = this.firstName = firstName;
        this.phoneNumber =phoneNumber;
        this.telephoneOperator =telephoneOperator;
    }

    @Override
    public String toString() {
        return "User name is " + this.firstName + ", phone number is "
                        + this.phoneNumber + ", telephone operator is " +this.telephoneOperator;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneOperator() {
        return telephoneOperator;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneOperator(String telephoneOperator) {
        this.telephoneOperator = telephoneOperator;
    }
}
