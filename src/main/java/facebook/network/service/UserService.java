package facebook.network.service;

import facebook.network.data.Database;
import facebook.network.model.User;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class UserService {

    // todo create method getAll(), getFirst(), getLast(),
    // todo getByName(String name )

    public static void main(String[] args) {
//        getAll(); // print all users
//        getFirst(); // first in mas
//        getLast(); // last in mas

        final String name = "Bob";

        final User userByName = getByName(name);
        System.out.println(userByName);
        // todo create method getBy... (all fields)
    }

    private static User getByName(String name) {
        final User[] users = Database.getUsers();
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    private static void getAll() {
        final User[] users = Database.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
