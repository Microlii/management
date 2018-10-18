package com.iotek.service.impl;

import com.iotek.dao.UserDao;
import com.iotek.entity.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUser(Integer id, int id1) {
        userDao.updateUser(id,id1);
    }

    @Override
    public void updatedPassword(Integer id, String newPassword) {
        userDao.updatedPassword(id,newPassword);
    }

    @Override
    public User findUserByResume(Integer id) {
        return userDao.findUserByResume(id);
    }

    @Override
    public void updateUserType(User user) {
        userDao.updateUserType(user);
    }

}
