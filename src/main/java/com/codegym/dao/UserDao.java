package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(22);
        u1.setName("Long");
        u1.setAccount("long");
        u1.setEmail("long@gmail.com");
        u1.setPassword("123456");
        users.add(u1);


        User u2 = new User();
        u2.setAge(26);
        u2.setName("Huong");
        u2.setAccount("huong");
        u2.setEmail("huong@gmail.com");
        u2.setPassword("123456");
        users.add(u2);


        User u3 = new User();
        u3.setAge(29);
        u3.setName("Hai");
        u3.setAccount("hai");
        u3.setEmail("hai@gmail.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
