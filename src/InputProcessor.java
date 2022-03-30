import java.util.Scanner;

public class InputProcessor {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller = new Controller();

    public void start() {
        // add student firstName lastName nationalCode studentId department
        // add professor firstName lastName nationalCode department
        // add course name num unit group nationalCode preCourse1,preCourse2,...
        while (true) {
            String input = scanner.nextLine();
            if (input.startsWith("add student")) {
                String[] splitInput = input.split("\\s");
                processAddStudent(splitInput[2], splitInput[3], splitInput[4],
                        Integer.parseInt(splitInput[5]), splitInput[6]);
            } else if (input.startsWith("add professor")) {
                processAddProfessor();
            } else if (input.startsWith("add course")) {
                processAddCourse();
            } else if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                System.err.println("Invalid command!");
            }
        }
    }

    private void processAddStudent(String firstName, String lastName, String nationalCode,
                                   int studentId, String department) {
        controller.addStudent(firstName, lastName, nationalCode, studentId, department);
    }

    private void processAddProfessor() {

    }

    private void processAddCourse() {

    }
}
