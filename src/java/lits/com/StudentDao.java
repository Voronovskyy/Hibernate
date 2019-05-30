package lits.com;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class StudentDao {
    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }
    public void deleteById(Object id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.delete(id);
    }
    public  void updateByID(Object id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.update(id);
    }

}