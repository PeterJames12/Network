package facebook.dao;

import facebook.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public interface UserDao {

    List<User> getAll();
}

