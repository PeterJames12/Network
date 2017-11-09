package facebook.data;

import facebook.model.Group;
import facebook.model.Post;
import facebook.model.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class Database {

    public static List<User> getAllUsers() {
        List<User> users = new LinkedList<>();
        final User user = new User();
        user.setName("Alex");
        users.add(user);
        return users;
    }

    public static List<Post> getAllPost() {
        List<Post> posts = new LinkedList<>();
        final Post post = new Post();
        post.setTitle("Some");
        post.setDescription("News");
        posts.add(post);
        return posts;
    }


    public static List<Group> getAllGroup() {
        List<Group> groups = new LinkedList<>();

        final Group vertex = new Group();
        vertex.setName("Vertex Academy");
        vertex.setDateOfCreate(LocalDate.of(2015, Month.NOVEMBER, 9));
        vertex.setFollowers(500L);

        final Group igorJava = new Group();
        igorJava.setName("The best professional java course");
        igorJava.setDateOfCreate(LocalDate.of(2017, Month.NOVEMBER, 9));
        igorJava.setFollowers(500000000L);

        groups.add(vertex);
        groups.add(igorJava);

        return groups;
    }
}
