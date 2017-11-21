package facebook.controller;

import facebook.model.Group;
import facebook.service.GroupService;
import facebook.service.impl.GroupServiceImpl;
import facebook.util.Status;
import lombok.val;

import java.util.Iterator;
import java.util.List;

/**
 * @author Igor Hnes on 11/9/17.
 */
public class GroupController {

    public static void main(String[] args) {


        GroupService service = new GroupServiceImpl();
        val groups = service.getAllGroups();

        groups.forEach(System.out::println);

        for (Group group : groups) {
            System.out.println(group);
        }

        val iterator = groups.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
