package person;

public class Person {

    private String firstName;
    private String lastName;
    private String NationalCode;

    public Person(String firstName, String lastName, String nationalCode) {
        setFirstName(firstName);
        setLastName(lastName);
        setNationalCode(nationalCode);
    }

    // setters
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setNationalCode(String nationalCode) {
        NationalCode = nationalCode;
    }

    // getters
    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return NationalCode;
    }
}
