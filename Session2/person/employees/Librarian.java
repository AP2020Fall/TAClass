package person.employees;

import person.Person;

public class Librarian extends Person {

    private String employeeCode;

    public Librarian(String firstName, String lastName, String nationalCode, String employeeCode) {
        super(firstName, lastName, nationalCode);
        setEmployeeCode(employeeCode);
    }

    // setters
    private void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    // getters
    public String getEmployeeCode() {
        return employeeCode;
    }
}
