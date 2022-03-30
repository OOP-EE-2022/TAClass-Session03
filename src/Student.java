public class Student {
    String firstName;
    String lastName;
    private int studentId;
    private String nationalCode;
    private String department;

    public Student(String firstName, String lastName, String nationalCode,
                   int studentId, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.studentId = studentId;
        this.department = department;
    }
}
