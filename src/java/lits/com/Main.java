package lits.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Danylo","Voronovsky",25,25);
        Student student1 = new Student("Volodya","ASd",32,29);
        studentDao.saveStudent(student);

        Book book = new Book(2,"Dad",student);
        Book boob1 = new Book(3,"Boy",student1);
        student.setBooks(Arrays.asList(book));
        studentDao.saveStudent(student);

    }
}
