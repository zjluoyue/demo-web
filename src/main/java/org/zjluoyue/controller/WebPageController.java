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


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String isUser(User user, ModelMap model) {
        System.out.println(user);
        System.out.println("Login Successful");

        model.addAttribute("user", user);
        model.addAttribute("greet", "welcome");
        return "home";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(User user) {
        System.out.println(user);
        System.out.println("Register Successful");
        return "redirect:/login";
    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "toLgin";
    }

}
