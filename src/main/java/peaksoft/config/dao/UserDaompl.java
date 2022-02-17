package peaksoft.config.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import peaksoft.config.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaompl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        System.out.println(user);
        session.save(user);
        session.close();
    }

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().
                createQuery("from User ").
                getResultList();

    }

    @Override
    public User updateUser(int id) {
        return sessionFactory.getCurrentSession().get(User.class,id);
         }

    @Override
    public void removeUser(int id) {
        sessionFactory.getCurrentSession().createSQLQuery("delete from users where id = ?").
                setParameter(1,id).executeUpdate();
    }
}

