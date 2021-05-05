package com.ly.service;

import com.ly.pojo.User;

public interface UserService {
    public void save();
    public User create(int age, String name);
}
