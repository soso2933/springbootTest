package com.coco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cocoLin
 * @create 2021-07-27 21:15
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public String msg(Model model){
        model.addAttribute("data","springboot继承thymeleaf模板引擎");
        return "msg";
    }
}
