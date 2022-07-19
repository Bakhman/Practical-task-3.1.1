package com.bakh.practice.springbootpractice.service;

import com.bakh.practice.springbootpractice.model.User;

import java.util.List;

/**
 * @author Bakhmai Begaev
 */
public interface UserService {
    User findUserById(long id);
    List<User> findAllUsers();
    User saveUser(User user);
    void deleteUserById(long id);
    void editUserById(long id);
}
