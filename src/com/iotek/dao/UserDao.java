package com.iotek.dao;

import com.iotek.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface UserDao {
    void addUser(User user);
    User findUserByAccountAndPassword(@Param("account") String account,@Param("password") String password);

    User findUserByAccount(String account);

    List<User> findAllUsers();

    User findUserById(Integer id);

    void updateUser(@Param("resume") Integer id,@Param("id") int id1);

    void updatedPassword(@Param("id") Integer id,@Param("password") String newPassword);

    User findUserByResume(Integer id);
}
