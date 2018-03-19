package com.logger.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoMock {
    private static List<User> users;

    public static Optional<User> getUserByUserName(String userName) {
        return users.stream()
                .filter(u-> u.getUserName().equals(userName))
                .findFirst();
    }
    public static Optional<User> getUserByUserNameAndPassword(String username, String password) {
        return users.stream()
                .filter(u -> u.getUserName().equals(username))
                .findFirst();
    }
    static {
        users = new ArrayList<>();
        User user1 = new User("kaka","uraka","kaka@gmail.com");
        user1.setUserId(1);
        User user2 = new User("Lola","kotek01","Lolka@gmail.com");
        user1.setUserId(2);
    }
}
