package org.zjluoyue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.zjluoyue.model.User;
import org.zjluoyue.service.UserService;

import javax.annotation.Resource;


/**
 * Created by zjluoyue on 2016/8/18.
 */
@Controller
//@RequestMapping("/SimpleLoginWeb")
public class WebPageController {

    @Resource
    UserService userService;


    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String isUser(User user, ModelMap model) {
        System.out.println(user);
        System.out.println("Login Successful");

        model.addAttribute("user", user);
        model.addAttribute("greet", "welcome");
        return "home";
    }

    @GetMapping(value = "/register")
    public String register() {
        return "register";
    }

    @PostMapping(value = "/register")
    public String addUser(@RequestBody User user) {
        return "redirect:/login";
    }


}
