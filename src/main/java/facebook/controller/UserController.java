package facebook.controller;

import facebook.service.UserService;
import facebook.service.factory.ServiceFactory;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class UserController {

    public static void main(String[] args) {
        final UserService userService = ServiceFactory.getUserService();
        System.out.println(userService.getAll().get(0).getName());
    }
}
