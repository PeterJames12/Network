package facebook.dao.impl;

import facebook.dao.PostDao;
import facebook.data.Database;
import facebook.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class PostDaoImpl implements PostDao {

    @Override
    public List<Post> getAll() {
        return Database.getAllPost();
    }
}
