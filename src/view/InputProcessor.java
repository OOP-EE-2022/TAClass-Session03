package view;

import controller.Controller;

import java.util.Scanner;

public class InputProcessor {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller = new Controller();

    public void start() {
        // add student firstName lastName nationalCode studentId department
        // add professor firstName lastName nationalCode department
        // add course name num unit group professorNationalCode preCourse1,preCourse2,...
        // add course name num unit group professorNationalCode
        // set preCourses num preCourse1,preCourse2,...
        // show students
        // show professors
        // show people
        // take course studentId num
        // drop course studentId num
        while (true) {
            String input = scanner.nextLine();
            if (input.startsWith("add student")) {
                processAddStudent(input.split("\\s"));
            } else if (input.startsWith("add professor")) {
                processAddProfessor(input.split("\\s"));
            } else if (input.startsWith("add course")) {
                processAddCourse(input.split("\\s"));
            } else if (input.equalsIgnoreCase("show students")) {
                processShowStudents();
            } else if (input.startsWith("show professors")) {
                processShowProfessors();
            } else if (input.equalsIgnoreCase("show people")) {
                processShowPeople();
            } else if (input.equalsIgnoreCase("take course")) {
                processTakeCourse(input.split("\\s"));
            } else if (input.equalsIgnoreCase("drop course")) {
                processDropCourse(input.split("\\s"));
            } else if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                System.err.println("Invalid command!");
            }
        }
    }

    private void processTakeCourse(String[] splitInput) {
        String output = controller.takeCourse(Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3]));
        System.out.println(output);
    }

    private void processDropCourse(String[] splitInput) {
        String output = controller.dropCourse(Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3]));
        System.out.println(output);
    }

    private void processAddStudent(String[] splitInput) {
        String output = controller.addStudent(splitInput[2], splitInput[3], splitInput[4], Integer.parseInt(splitInput[5]), splitInput[6]);
        System.out.println(output);
    }

    private void processAddProfessor(String[] splitInput) {
        String output = controller.addProfessor(splitInput[2], splitInput[3], splitInput[4], splitInput[5]);
        System.out.println(output);
    }

    private void processAddCourse(String[] splitInput) {
        // add course name num unit group professorNationalCode preCourse1,preCourse2,...
        // add course name num unit group professorNationalCode
        String output;
        if (splitInput.length == 7) {
            output = controller.addCourse(splitInput[2], Integer.parseInt(splitInput[3]),
                    Integer.parseInt(splitInput[4]), Integer.parseInt(splitInput[5]),
                    splitInput[6]);
        } else {
            output = controller.addCourse(splitInput[2], Integer.parseInt(splitInput[3]),
                    Integer.parseInt(splitInput[4]), Integer.parseInt(splitInput[5]),
                    splitInput[6], splitInput[7]);
        }
        System.out.println(output);
    }

    private void processShowStudents() {
        String output = controller.showStudents();
        System.out.println(output);
    }

    private void processShowProfessors() {
        String output = controller.showProfessors();
        System.out.println(output);
    }

    private void processShowPeople() {
        String output = controller.showPeople();
        System.out.println(output);
    }
}
