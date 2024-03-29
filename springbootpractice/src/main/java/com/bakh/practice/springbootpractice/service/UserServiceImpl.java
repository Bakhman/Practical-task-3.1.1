package com.bakh.practice.springbootpractice.service;

import com.bakh.practice.springbootpractice.model.User;
import com.bakh.practice.springbootpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bakhmai Begaev
 */
@Service
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(long id) {
        return  userRepository.getReferenceById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void editUserById(long id) {
        userRepository.existsById(id);
    }
}
