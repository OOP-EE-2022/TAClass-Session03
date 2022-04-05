import java.util.ArrayList;

public class Controller {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Professor> professors  = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();

    public String addStudent(String firstName, String lastName, String nationalCode,
                           int studentId, String department) {
        if (searchStudentByNationalCode(nationalCode) == null) {
            Student student = new Student(firstName, lastName, nationalCode,
                    studentId, department);
            students.add(student);
            people.add(student);
            return "add student successful";
        } else {
            return "national code was taken";
        }
    }

    public String addProfessor(String firstName, String lastName, String nationalCode, String department) {
        if (searchProfessor(nationalCode) == null) {
            Professor professor = new Professor(firstName, lastName, nationalCode, department);
            professors.add(professor);
            return "add professor successful";
        } else {
            return "national code was taken";
        }
    }

    public String showStudents() {
        StringBuilder output = new StringBuilder("");
        for (Student student : students) {
            output.append(student.getFirstName()).append(", ").append(student.getLastName()).append(", ")
                    .append(student.getStudentId()).append("\n");
        }
        return output.toString();
    }

    public String showProfessors() {
        StringBuilder output = new StringBuilder("");
        for (Professor professor : professors) {
            output.append(professor.getFirstName()).append(", ").append(professor.getLastName()).append(", ")
                    .append(professor.getNationalCode()).append("\n");
        }
        return output.toString();
    }

    private Student searchStudentByNationalCode(String nationalCode) {
        for (Student student : students) {
            if (student.getNationalCode().equals(nationalCode)) {
                return student;
            }
        }
        return null;
    }

    private Student searchStudentByStudentId(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    private Professor searchProfessor(String nationalCode) {
        for (Professor professor : professors) {
            if (professor.getNationalCode().equals(nationalCode)) {
                return professor;
            }
        }
        return null;
    }

}
