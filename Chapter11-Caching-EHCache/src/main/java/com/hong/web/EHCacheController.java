package com.hong.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hong on 2017/5/8.
 */
@Controller
public class EHCacheController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());




    @RequestMapping("/cache")
    public void test(){

    }
}
