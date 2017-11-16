package facebook.service;

import facebook.dao.PostDao;
import facebook.data.Database;
import facebook.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public interface PostService {

    List<Post> getAll();
}
