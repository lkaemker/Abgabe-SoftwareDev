import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager<Student> studentManager = new EntityManager<>();
        EntityManager<Lecturer> lecturerManager = new EntityManager<>();
        EntityManager<Course> courseManager = new EntityManager<>();

        // Adding some students
        Student student1 = new Student("Jeff", "Mueller", 678);
        Student student2 = new Student("Peter", "Pan", 123);
        studentManager.addEntity(student1);
        studentManager.addEntity(student2);

        // Adding some lecturers
        Lecturer lecturer1 = new Lecturer("Dr. John", "Doe", 234);
        Lecturer lecturer2 = new Lecturer("Dr. Jane", "Roe", 345);
        lecturerManager.addEntity(lecturer1);
        lecturerManager.addEntity(lecturer2);

        // Adding some courses
        Course course1 = new Course(987, "Math 101");
        Course course2 = new Course(876, "History 101");
        courseManager.addEntity(course1);
        courseManager.addEntity(course2);

        // Finding a student by ID
        Student foundStudent = studentManager.getEntityById(123, s -> s.getId() == 123);
        System.out.println("Found Student: " + (foundStudent != null ? foundStudent.getFirstName() : "Not Found"));

        // Filtering students with a specific condition (e.g., last name "Pan")
        List<Student> filteredStudents = studentManager.filterEntities(s -> s.getLastName().equals("Pan"));
        System.out.println("Filtered Students with last name 'Pan': " + filteredStudents.size());

        // Finding a lecturer by ID
        Lecturer foundLecturer = lecturerManager.getEntityById(345, l -> l.getId() == 345);
        System.out.println("Found Lecturer: " + (foundLecturer != null ? foundLecturer.getFirstName() : "Not Found"));


    }
}


