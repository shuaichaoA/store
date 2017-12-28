package com.zdl.store.service;

import com.zdl.store.orm.base.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
