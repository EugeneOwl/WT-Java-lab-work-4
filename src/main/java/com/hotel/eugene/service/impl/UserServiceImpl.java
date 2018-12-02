package com.hotel.eugene.service.impl;

import com.hotel.eugene.entity.User;
import com.hotel.eugene.repository.UserRepository;
import com.hotel.eugene.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }
}
