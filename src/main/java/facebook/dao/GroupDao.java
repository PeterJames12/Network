package facebook.dao;

import facebook.model.Group;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public interface GroupDao {

    List<Group> getAllGroups();
}