package org.zjluoyue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping()
    public String hello(ModelMap model) {
        model.addAttribute("greeting", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping("/simple")
    public String simple() {
        return "simple";
    }
}
