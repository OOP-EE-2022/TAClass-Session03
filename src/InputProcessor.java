import java.util.Scanner;

public class InputProcessor {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller = new Controller();

    public void start() {
        // add student firstName lastName nationalCode studentId department
        // add professor firstName lastName nationalCode department
        // add course name num unit group nationalCode preCourse1,preCourse2,...
        // show students
        // show professors
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
            } else if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                System.err.println("Invalid command!");
            }
        }
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

    }

    private void processShowStudents() {
        String output = controller.showStudents();
        System.out.println(output);
    }

    private void processShowProfessors() {
        String output = controller.showProfessors();
        System.out.println(output);
    }
}
