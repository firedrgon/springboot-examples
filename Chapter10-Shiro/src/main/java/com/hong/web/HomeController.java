package com.hong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hong on 2017/5/5.
 */
@Controller
public class HomeController {


    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @GetMapping(value="/login")
    public String login(){

        return"login";
    }
}
