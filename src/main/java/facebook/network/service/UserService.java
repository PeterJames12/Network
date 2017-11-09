package facebook.network.service;

import facebook.network.data.Database;
import facebook.network.model.User;
import vertex.counter.VertexCounter;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class UserService {

    // todo create method getAll(), getFirst(), getLast(),
    // todo getByName(String name )

    public static void main(String[] args) {

        final VertexCounter vertexCounter = new VertexCounter();
        final int unicode = vertexCounter.countUnicode("test");
        System.out.println(unicode);
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
