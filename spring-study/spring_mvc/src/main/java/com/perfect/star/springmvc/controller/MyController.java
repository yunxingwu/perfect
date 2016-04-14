package com.perfect.star.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by  wuyunxing on   2016/4/13.
 */
@Controller
@RequestMapping("/con")
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return  "hello";
    }

    @RequestMapping("/nice")
    public  void  nice(){
        System.out.println("nice");
    }
}
