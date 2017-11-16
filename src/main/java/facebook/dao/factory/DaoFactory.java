package facebook.dao.factory;

import facebook.dao.UserDao;
import facebook.dao.impl.UserDaoImpl;

/**
 * @author Igor Hnes on 11/16/17.
 */
public class DaoFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
