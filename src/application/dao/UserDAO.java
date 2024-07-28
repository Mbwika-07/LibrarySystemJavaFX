package application.dao;

import application.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> users;

    public UserDAO() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
