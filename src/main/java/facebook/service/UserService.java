package facebook.service;

import facebook.dao.UserDao;
import facebook.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class UserService {

    public List<User> getAll() {
        final UserDao userDao = new UserDao();
        return userDao.getAll();
    }
}
