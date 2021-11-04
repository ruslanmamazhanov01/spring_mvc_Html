package peaksoft.config.servic;

import peaksoft.config.dao.UserDao;
import peaksoft.config.model.User;

import java.util.List;

public interface UserService  {
    void addUser(User user);
    List<User> getAllUsers();

    void updateUser(int id);
    void removeUser(int id);
}
