package facebook.service.impl;

import facebook.dao.PostDao;
import facebook.dao.impl.PostDaoImpl;
import facebook.model.Post;
import facebook.service.PostService;

import java.util.List;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class PostServiceImpl implements PostService {

    @Override
    public List<Post> getAll() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAll();
    }
}
