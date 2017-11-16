package facebook.dao;

import facebook.data.Database;
import facebook.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public interface PostDao {

    List<Post> getAll();
}
