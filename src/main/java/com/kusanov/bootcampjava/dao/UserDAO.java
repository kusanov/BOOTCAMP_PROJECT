package com.kusanov.bootcampjava.dao;

import com.kusanov.bootcampjava.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

}
