package person;

public class Author extends Person {

    FieldOfInterest fieldOfInterest;

    public Author(String firstName, String lastName, String nationalCode, FieldOfInterest fieldOfInterest) {
        super(firstName, lastName, nationalCode);
        setFieldOfInterest(fieldOfInterest);
    }

    public void setFieldOfInterest(FieldOfInterest fieldOfInterest) {
        this.fieldOfInterest = fieldOfInterest;
    }

    public String getName() {
        return (getFirstName() + " " + getLastName());
    }
}
