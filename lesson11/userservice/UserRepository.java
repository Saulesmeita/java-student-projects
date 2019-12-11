package lv.javaguru.lesson11.userservice;


import java.util.HashMap;

public class UserRepository {

    HashMap<Integer, User> users = new HashMap<Integer, User>();
    private static int nr = 0;

    public void save(User user) {
        Integer key = ++nr;
        user.setId(key);
        users.put(key, user);
    }

}
