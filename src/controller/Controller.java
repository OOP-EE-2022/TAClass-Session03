package controller;

import model.Course;
import model.Person;
import model.Professor;
import model.Student;

import java.util.ArrayList;

public class Controller {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Professor> professors  = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();

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
            people.add(professor);
            return "add professor successful.";
        } else {
            return "national code was taken!";
        }
    }

    public String addCourse(String name, int num, int unit, int group,
                            String professorNationalCode, String preCourses) {
        // add course name num unit group professorNationalCode preCourse1,preCourse2,...
        Professor professor = searchProfessor(professorNationalCode);
        if (professor == null) {
            return "professor not found!";
        }
        if (searchCourse(num) != null) {
            return "course number was taken!";
        }
        String[] splitPreCourses = preCourses.split(",");
        ArrayList<Course> preCoursesList = new ArrayList<>();
        for (String splitPreCourse : splitPreCourses) {
            Course course = searchCourse(Integer.parseInt(splitPreCourse));
            if (course == null) {
                return "add course failed!\tpre-course was not found!";
            }
            preCoursesList.add(course);
        }
        Course course = new Course(name, num, unit, group, professor, preCoursesList);
        courses.add(course);
        return "add course successful.";
    }

    public String addCourse(String name, int num, int unit, int group,
                            String professorNationalCode) {
        // add course name num unit group professorNationalCode
        Professor professor = searchProfessor(professorNationalCode);
        if (professor == null) {
            return "professor not found!";
        }
        if (searchCourse(num) != null) {
            return "course number was taken!";
        }
        Course course = new Course(name, num, unit, group, professor);
        courses.add(course);
        return "add course successful.";
    }

    public String showStudents() {
        StringBuilder output = new StringBuilder("");
        for (Student student : students) {
            output.append(student.getType()).append(" ").append(student.getFirstName())
                    .append(", ").append(student.getLastName()).append(", ")
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

    public String showPeople() {
        StringBuilder output = new StringBuilder("");
        for (Person person : people) {
            if (person.getType().equals("Student")) {
                Student student = (Student) person;
                output.append("Student").append(" ").append(student.getStudentId()).append("\n");
            } else {
                Professor professor = (Professor) person;
                output.append("Professor").append(" ").append(professor.getNationalCode()).append("\n");
            }
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

    private Course searchCourse(int num) {
        for (Course course : courses) {
            if (course.getCourseNum() == num) {
                return course;
            }
        }
        return null;
    }

}
