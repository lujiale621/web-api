package org.it.web.controller;

import org.it.web.bean.User;
import org.it.web.mapper.UserMapper;
import org.it.web.util.requestpython.NovelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    UserMapper userMapper;

    @PostMapping(value = "/login_in")
    public String login(String username, String password, HttpServletResponse res, Map<String,Object> map){
        User user = userMapper.getUserByName(username);
        if (user==null){
            map.put("msg","该用户不存在");
            return "login";
        }
        if(user.getPassword().equals(password)) {
            Cookie cookie = new Cookie("loginuser",username);
            res.addCookie(cookie);
            return "success";
        }else{
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
    @PostMapping(value = "/sign_up")
    public String sign_up(@RequestParam(value = "usernames") String is_name,
                          @RequestParam(value = "passwords") String is_passwd,
                          @RequestParam(value = "email") String is_email,
                          @RequestParam(value = "phone") String is_phone){
        User userByName = userMapper.getUserByName(is_name);
        if (userByName==null){
            User user=new User();
            user.setUsername(is_name);
            user.setPassword(is_passwd);
            user.setEmail(is_email);
            user.setPhone(is_phone);
            userMapper.insertUser(user);
        }
        return "login";
    }
    @RequestMapping(value = "/api")
    public String api(){
        return "api";
    }

}
