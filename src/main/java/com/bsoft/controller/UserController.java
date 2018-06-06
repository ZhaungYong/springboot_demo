package com.bsoft.controller;

import com.bsoft.pojo.User;
import com.bsoft.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getString")
    public String getString() {
        return "hello springboot";
    }

    @RequestMapping("getPojo")
    public User getUser() {
        User user = new User();
        user.setId("1");
        return user;
    }

    @RequestMapping("getAllUser")
    public List<User> getAllUser() {
        System.out.println("hh");
        return userService.findAll();
    }

    @RequestMapping("test")
    public String test(Model model) {
        model.addAttribute("name", "zy");
        return "test";
    }

    @RequestMapping("user/add")
    public String add() {
        return "user/add";
    }

    @RequestMapping("user/update")
    public String update() {
        return "user/update";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("loginAction")
    public String loginAction(String username, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return "redirect:test";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不正确");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("noAuthor")
    public String noAuthor() {
        return "noAuthor";
    }
}
