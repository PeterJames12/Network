package facebook.service.factory;

import facebook.service.PostService;
import facebook.service.UserService;
import facebook.service.impl.PostServiceImpl;
import facebook.service.impl.UserServiceImpl;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class ServiceFactory {

    public static void main(String[] args) {
        final PostService postService = ServiceFactory.getPostService();
    }

    /**
     * @return instance of {@link UserServiceImpl}
     */
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    /**
     * @return instance of {@link PostServiceImpl}
     */
    public static PostService getPostService() {
        return new PostServiceImpl();
    }
}
