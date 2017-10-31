package facebook.vertex.service.message;

import facebook.network.model.User;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class HappyBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " "
                + user.getSurname()
                + " "
                + "Happy birthday";
    }
}
