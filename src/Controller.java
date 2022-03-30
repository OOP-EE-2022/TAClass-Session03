import java.util.ArrayList;

public class Controller {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String nationalCode,
                           int studentId, String department) {
        Student student = new Student(firstName, lastName, nationalCode,
                studentId, department);
        students.add(student);
    }

}
