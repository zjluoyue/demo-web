package org.zjluoyue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zjluoyue on 2016/7/30.
 */
@Controller
@RequestMapping(value = "/demo-web")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello Spring MVC Framework!");
        return "hello";
    }
}
