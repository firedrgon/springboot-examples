package com.hong.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/5/19.
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name",defaultValue = "张三") String name){
        return "hello"+name;
    }
}
