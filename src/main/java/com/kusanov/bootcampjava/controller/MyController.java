package com.kusanov.bootcampjava.controller;

import com.kusanov.bootcampjava.entity.User;
import com.kusanov.bootcampjava.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    private static Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> goToWelcome() {
        List<User> allUsers = userService.getAllUsers();
        logger.info("Getting Users!");
        return allUsers;
    }
    @GetMapping("/error")
    public String getError() {
        logger.info("Getting error!");
        return null;
    }
    @GetMapping("/users/{id}")
    public User getEmployee(@PathVariable int id) {
        User user = userService.getUser(id);
        logger.info("Getting user №"+id);
        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = userService.getUser(id);
        userService.deleteUser(id);
    }
}