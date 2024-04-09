import java.util.ArrayList;

public class Course {
    private String courseTitle;
    private Teacher instructorName;
    private ArrayList<Student> roster;

    public Course(String courseTitle, Teacher instructorName) {
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
    }
}
