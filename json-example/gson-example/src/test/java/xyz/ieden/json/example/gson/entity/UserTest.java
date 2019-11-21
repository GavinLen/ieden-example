package xyz.ieden.json.example.gson.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/20 16:37
 */
public class UserTest {

    @Test
    public void testAnnotation() {
        String str = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(getUser(1));
        System.out.println(str);
    }

    @Test
    public void testToStr() {
        User user = new User(1, "tom", "abc", new Date());
        final Gson gson = new Gson();
        final String gsonStr = gson.toJson(user);
        System.out.println(gsonStr);
    }

    private List<User> getUserList() {
        Integer size = 3;
        List<User> userList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            userList.add(getUser(i));
        }
        return userList;
    }

    private User getUser(Integer userId) {
        User user = new User(userId, "tom_" + userId, "abc", new Date());
        return user;
    }

}
