package facebook.controller;

import facebook.model.Post;
import facebook.service.PostService;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class PostController {

    public static void main(String[] args) {

        final PostService postService = new PostService();

        final List<Post> all = postService.getAll();

        for (Post post : all) {
            System.out.println(post);
        }
    }
}
