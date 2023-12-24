package com.alfaizuna.taskmanager.service.impl;

import com.alfaizuna.taskmanager.model.User;
import com.alfaizuna.taskmanager.repository.UserRepository;
import com.alfaizuna.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singletonList("USER"));
        userRepository.save(user);
    }
}

