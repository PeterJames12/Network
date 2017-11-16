package facebook.controller;

import facebook.model.User;
import facebook.service.UserService;
import facebook.service.factory.ServiceFactory;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class UserController {

    public static void main(String[] args) {
        final UserService userService = ServiceFactory.getUserService();
        final User user = userService.getByName("Adsjhdr");
        System.out.println(user);
    }
}
