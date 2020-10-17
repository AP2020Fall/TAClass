package person.employees;

import person.Person;

public class Manager extends Person {

    String phoneNumber;

    public Manager(String firstName, String lastName, String nationalCode, String phoneNumber) {
        super(firstName, lastName, nationalCode);
        setPhoneNumber(phoneNumber);
    }

    // setters
    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
