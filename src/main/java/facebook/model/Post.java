package facebook.model;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class Post {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" + "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
