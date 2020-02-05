package com.leyue.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "欢迎你");
        return "login";
    }

    @RequestMapping("/main")
    public String main() {

        return "main";
    }


    @RequestMapping("/register")
    public String register() {

        return "register";
    }
}
