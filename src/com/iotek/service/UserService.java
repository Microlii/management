package com.iotek.service;

import com.iotek.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface UserService {
    User findUserByAccountAndPassword(String account, String password);

    User findUserByAccount(String account);

    void addUser(User user1);
}
