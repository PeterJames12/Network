package facebook.service.impl;

import facebook.dao.UserDao;
import facebook.dao.factory.DaoFactory;
import facebook.dao.impl.UserDaoImpl;
import facebook.model.User;
import facebook.service.UserService;

import java.util.List;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        final UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    @Override
    public User getByName(String name) {
        return DaoFactory.getUserDao().getByName(name);
    }
}
