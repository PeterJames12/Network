package facebook.network.data;

import facebook.network.model.User;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class Database {

    public static User[] getUsers() {
        return new User[]{
                new User("Alex", 12),
                new User("Bob", 14),
                new User("Smith", 19)
        };
    }
}
