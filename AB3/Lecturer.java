import java.util.List;

public class Lecturer extends User {
    private List<Course> managedCourses;

    public Lecturer(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
    public void manageCourse(Course course) {
        managedCourses.add(course);
    }
}
