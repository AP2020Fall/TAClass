package person.employees;

import person.Person;

public class Staff extends Person {

    private double salary;
    private int age;
    private boolean gender;

    public Staff(String firstName, String lastName, String nationalCode, double salary, int age, boolean gender) {
        super(firstName, lastName, nationalCode);
        setSalary(salary);
        setAge(age);
        setGender(gender);
    }

    // setters
    private void setSalary(double salary) {
        this.salary = salary;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGender(boolean gender) {
        this.gender = gender;
    }

    // getters
    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
