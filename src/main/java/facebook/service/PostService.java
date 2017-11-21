package facebook.service;

import facebook.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
@FunctionalInterface
public interface PostService {

    List<Post> getAll();
}
