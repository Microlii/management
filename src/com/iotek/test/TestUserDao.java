package com.iotek.test;

import com.iotek.dao.UserDao;
import com.iotek.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")


public class TestUserDao {
    @Autowired
    private UserDao userDao;
    @Test
    public void testAddUser(){
        User user = new User("aaa","aaa",0);
        userDao.addUser(user);
    }
    @Test
    public void testFindUserByAccountAndPassword(){
        User user = userDao.findUserByAccountAndPassword("aaa","aaa");
        System.out.println(user);
    }
    @Test
    public void testFindUserByAccount(){
        User user = userDao.findUserByAccount("aaa");
        System.out.println(user);
    }
    @Test
    public void testFindAllUsers(){
        List<User> user = userDao.findAllUsers();
        System.out.println(user);
    }
}
