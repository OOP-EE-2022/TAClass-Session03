public class Student extends Person {
    private int studentId;
    private String department;

    public Student(String firstName, String lastName, String nationalCode,
                   int studentId, String department) {
        super(firstName, lastName, nationalCode);
        this.studentId = studentId;
        this.department = department;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getDepartment() {
        return department;
    }
}
