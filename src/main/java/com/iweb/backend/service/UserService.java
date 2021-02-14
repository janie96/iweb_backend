package com.iweb.backend.service;

import com.iweb.backend.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}