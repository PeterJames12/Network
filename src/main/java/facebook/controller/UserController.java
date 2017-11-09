package facebook.controller;

import facebook.model.User;
import facebook.service.UserService;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class UserController {

    public static void main(String[] args) {
        final UserService userService = new UserService();
        final List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println(user.getName());
        }
    }
}
