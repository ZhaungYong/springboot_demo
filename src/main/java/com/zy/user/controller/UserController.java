package com.zy.user.controller;

import com.zy.common.utils.Md5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public String loginAction(String username, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();
        String md5_password = Md5Util.getMD5String(password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, md5_password);
        try {
            subject.login(token);
            return "redirect:/index";
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
