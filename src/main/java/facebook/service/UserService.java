package facebook.service;

import facebook.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public interface UserService {

    List<User> getAll();

    User getByName(String name);
}
