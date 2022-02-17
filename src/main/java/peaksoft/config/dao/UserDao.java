package peaksoft.config.dao;

import org.hibernate.query.Query;
import peaksoft.config.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> getAllUsers();
    User updateUser(int id);
    void removeUser(int id);
}
