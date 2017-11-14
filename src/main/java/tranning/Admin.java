package tranning;

/**
 * @author Igor Hnes on 11/14/17.
 */
public class Admin {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin " + "name = " + getName();
    }
}
