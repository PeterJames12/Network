package facebook.vertex.service;

import facebook.network.model.User;
import facebook.vertex.service.message.HappyBuilder;
import facebook.vertex.service.message.MessageBuilder;

/**
 * @author Igor Hnes on 10/31/17.
 */
public class MessageService {

    public static void main(String[] args) {

        final User user = new User();
        user.setName("Alex");
        user.setSurname("Smirnov");
        MessageBuilder builder = new HappyBuilder();

        final String message = builder.build(user);
        System.out.println(message);
    }
}
