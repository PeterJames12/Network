package facebook.vertex.service.message;

import facebook.network.model.User;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class MessageBuilder {

    public String build(User user) {
        return "Dear " + user.getName();
    }
}
