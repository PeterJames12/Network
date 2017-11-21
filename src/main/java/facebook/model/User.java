package facebook.model;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class User {

    private String name;
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

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

    public enum Status {SINGLE, MARRIED}
}
