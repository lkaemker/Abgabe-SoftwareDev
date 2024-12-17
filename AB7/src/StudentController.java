package AB7.src;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping()
    public Student getStudent(@RequestParam long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @PostMapping()
    void addStudent(@RequestBody Student student) {
       studentRepository.save(student);
    }
    @DeleteMapping()
    void deleteStudent(@RequestParam long id) {
        studentRepository.deleteById(id);
    }
}
