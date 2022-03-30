import java.util.ArrayList;

public class Course {
    String courseName;
    int courseNum;
    int courseUnit;
    int courseGroup;
    Professor professor;
    ArrayList<Course> preCourses = new ArrayList<>();
}
