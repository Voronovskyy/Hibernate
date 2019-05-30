package lits.com;

import javax.persistence.*;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Book(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
