package com.iotek.service.impl;

import com.iotek.dao.UserDao;
import com.iotek.entity.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByAccountAndPassword(String account, String password) {
        return userDao.findUserByAccountAndPassword(account,password);
    }

    @Override
    public User findUserByAccount(String account) {
        return userDao.findUserByAccount(account);
    }

    @Override
    public void addUser(User user1) {
        userDao.addUser(user1);
    }
}
