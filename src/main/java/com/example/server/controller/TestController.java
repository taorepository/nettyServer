package com.example.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: wtt
 * @create: 2020/07/01
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public ModelAndView test(){
        return new ModelAndView("test");
    }
}
