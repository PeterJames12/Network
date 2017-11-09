package facebook.dao;

import facebook.data.Database;
import facebook.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class PostDao {

    public List<Post> getAll() {
        return Database.getAllPost();
    }
}
