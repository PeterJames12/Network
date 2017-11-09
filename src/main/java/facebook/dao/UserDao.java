package facebook.dao;

import facebook.data.Database;
import facebook.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class UserDao {

    public List<User> getAll() {
        return Database.getAllUsers();
    }
}

