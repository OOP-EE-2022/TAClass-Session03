package model;

import java.util.ArrayList;

public class Course {
    String courseName;
    int courseNum;
    int courseUnit;
    int courseGroup;
    Professor professor;
    ArrayList<Course> preCourses = new ArrayList<>();

    public Course(String courseName, int courseNum, int courseUnit, int courseGroup, Professor professor) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.courseUnit = courseUnit;
        this.courseGroup = courseGroup;
        this.professor = professor;
    }

    public Course(String courseName, int courseNum, int courseUnit, int courseGroup, Professor professor, ArrayList<Course> preCourses) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.courseUnit = courseUnit;
        this.courseGroup = courseGroup;
        this.professor = professor;
        this.preCourses = preCourses;
    }

    public int getCourseNum() {
        return courseNum;
    }
}
