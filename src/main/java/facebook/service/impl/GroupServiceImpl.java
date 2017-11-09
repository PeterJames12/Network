package facebook.service.impl;

import facebook.dao.GroupDao;
import facebook.dao.impl.GroupDaoImpl;
import facebook.model.Group;
import facebook.service.GroupService;

import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class GroupServiceImpl implements GroupService {

    @Override
    public List<Group> getAllGroups() {
        GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getAllGroups();
    }
}
