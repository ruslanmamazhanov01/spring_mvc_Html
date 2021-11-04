package peaksoft.config.servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.config.dao.UserDao;
import peaksoft.config.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiecmpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        System.out.println("service add");
        userDao.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void updateUser(int id) {
        userDao.updateUser(id);
    }

    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }
}
