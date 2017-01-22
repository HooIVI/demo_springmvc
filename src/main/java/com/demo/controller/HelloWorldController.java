package com.demo.controller;

import com.demo.config.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Hoo on 2016/12/17.
 */
@Controller
@RequestMapping("/welcome")
public class HelloWorldController {

    @Autowired
    private SysConfig sysConfig;

    @RequestMapping("/hello")
    public ModelAndView printWelcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello World " + sysConfig.getDemo_env() + "!");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
