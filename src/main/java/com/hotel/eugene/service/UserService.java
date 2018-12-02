package com.hotel.eugene.service;

import com.hotel.eugene.entity.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
