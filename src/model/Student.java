package model;


import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    private String department;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String nationalCode,
                   int studentId, String department) {
        super(firstName, lastName, nationalCode);
        this.studentId = studentId;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String takeCourse(Course course) {
        if (courses.contains(course)) {
            return "student has the course";
        }
        courses.add(course);
        return "take course successfully";
    }

    public String dropCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return "drop course successfully";
        }
        return "student doesn't have the course";
    }

    @Override
    public String getType() {
        return "Student";
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

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
