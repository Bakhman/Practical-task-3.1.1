package com.bakh.practice.springbootpractice.repository;

import com.bakh.practice.springbootpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bakhmai Begaev
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
