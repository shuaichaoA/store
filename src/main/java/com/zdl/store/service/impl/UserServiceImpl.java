package com.zdl.store.service.impl;

import com.zdl.store.orm.base.User;
import com.zdl.store.orm.mapper.UserMapper;
import com.zdl.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userMapper.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public User getUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }
}
