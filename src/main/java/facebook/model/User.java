package facebook.model;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' +
                '}';
    }
}
