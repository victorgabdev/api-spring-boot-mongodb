package com.api.mongodb.projectSB.services;

import com.api.mongodb.projectSB.domain.User;
import com.api.mongodb.projectSB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
