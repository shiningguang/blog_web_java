package com.chen.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author ： chen
 * Date ： 16/8/22
 * Time : 下午6:19
 */
@Controller
@RequestMapping("/")
public class AppController {

    @RequestMapping("")
    public String index(ModelMap modelMap){
        return "index";
    }
}
