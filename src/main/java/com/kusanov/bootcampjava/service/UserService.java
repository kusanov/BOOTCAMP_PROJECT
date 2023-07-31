package com.kusanov.bootcampjava.service;

import com.kusanov.bootcampjava.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
