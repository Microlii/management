package com.iotek.controller;

import com.iotek.entity.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String account, String password, Model model){
        User user =userService.findUserByAccountAndPassword(account,password);
        if (user==null){
            model.addAttribute("�˺Ż��������","str");
            return "redirect:/index.jsp";
        }
        return "show";
    }
    @RequestMapping("registing")
    public String registing(String account,String password){

        return "regist";
    }
    @RequestMapping("logined")
    public String logined(String account,String password,Model model){
        User user = userService.findUserByAccount(account);
        if (user!=null){
            model.addAttribute("�˺��Ѿ�����","str");
            return "regist";
        }
        User user1 = new User(account,password,0);
        userService.addUser(user1);
        return "redirect:/index.jsp";
    }
}