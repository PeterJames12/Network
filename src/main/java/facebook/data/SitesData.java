package facebook.data;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 11/7/17.
 */
public class SitesData {

    public static List<String> getGoodSites() {
        List<String> list = new LinkedList<>();
        list.add("https://facebook.com");

        return list;
    }

    public static List<String> getBadSites() {
        List<String> list = new LinkedList<>();
        list.add("https://vk.com");
        return list;
    }

}
