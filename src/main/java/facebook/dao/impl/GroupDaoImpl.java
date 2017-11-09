package facebook.dao.impl;

import facebook.dao.GroupDao;
import facebook.data.Database;
import facebook.model.Group;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class GroupDaoImpl implements GroupDao {

    @Override
    public List<Group> getAllGroups() {
        return Database.getAllGroup();
    }
}
