package com.iweb.backend.service;

public interface  SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
