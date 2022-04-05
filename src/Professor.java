public class Professor extends Person {
    private String department;

    public Professor(String firstName, String lastName, String nationalCode, String department) {
        super(firstName, lastName, nationalCode);
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
