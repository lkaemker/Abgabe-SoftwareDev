import java.util.List;

public class Student extends User {
    private List<Course> registeredCourses;

    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }
}

