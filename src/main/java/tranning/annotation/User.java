package tranning.annotation;

import lombok.*;

/**
 * @author Igor Hnes on 11/21/17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String surname;
    private String status;
    private boolean sex;
    private int age;
}
