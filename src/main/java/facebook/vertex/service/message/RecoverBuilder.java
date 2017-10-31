package facebook.vertex.service.message;

import facebook.network.model.User;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class RecoverBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return super.build(user)
                + "you recover password"
                + "\n"
                + "check ur email for new pass";
    }
}
