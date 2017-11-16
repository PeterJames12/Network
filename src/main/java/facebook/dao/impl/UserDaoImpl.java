package facebook.dao.impl;

import facebook.dao.UserDao;
import facebook.data.Database;
import facebook.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }
}
