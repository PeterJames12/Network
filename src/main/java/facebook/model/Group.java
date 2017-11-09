package facebook.model;

import java.time.LocalDate;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class Group {

    private String name;
    private Long followers;
    private LocalDate dateOfCreate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public LocalDate getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(LocalDate dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public String toString() {
        return "Group{" + "name='" + name + '\'' +
                ", followers=" + followers +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}
