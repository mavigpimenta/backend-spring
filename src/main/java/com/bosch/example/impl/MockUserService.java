package com.bosch.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.bosch.example.model.User;
import com.bosch.example.services.UserService;

public class MockUserService implements UserService {
    private List<User> users = new ArrayList<>();

    public MockUserService() {
        var user = new User();
        user.setId(1l);
        user.setCountry("Brasil");
        user.setUsername("João");
        users.add(user);

        user = new User();
        user.setId(2l);
        user.setCountry("Alemanha");
        user.setUsername("Mavi");
        users.add(user);

        user = new User();
        user.setId(3l);
        user.setCountry("USA");
        user.setUsername("Michele");
        users.add(user);
    }

    @Override
    public void save(User user) {
       users.add(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return users.stream().filter(u -> u.getCountry().equals(country)).toList();
    }

    @Override
    public List<User> findByUsername(String username) {
        return users.stream().filter(u -> u.getUsername().contains(username)).toList();
    }
}
