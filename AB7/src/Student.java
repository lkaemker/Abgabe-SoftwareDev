package AB7.src;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;

    private String name;
    private String matNr;
    private String subject;

    public Student() {}

    public Student(long id, String name, String matNr, String subject) {
        this.id = id;
        this.name = name;
        this.matNr = matNr;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
