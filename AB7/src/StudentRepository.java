package AB7.src;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
        Student findByMatNr(String matNr);
        List<Student> findByName(String name);
}
