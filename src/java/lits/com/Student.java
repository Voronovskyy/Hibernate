package lits.com;

import javax.persistence.*;
import java.util.List;
import lits.com.Book;

@Entity
@Table(name = "student")

public class Student {

    private String name;
    private String surname;
    private int age;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Book> books;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Student (){

    }

    public Student(String name , String surname , int id , int age){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
