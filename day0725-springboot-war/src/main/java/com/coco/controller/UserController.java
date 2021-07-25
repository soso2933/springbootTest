package com.coco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cocoLin
 * @create 2021-07-25 11:44
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    @ResponseBody
    public Object userDetail(){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",1001);
        hashMap.put("userName","zhangsan");
        return hashMap;
    }

    @RequestMapping(value = "/user/detail1")
    public String userDetail1(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("userName","lisi");
        return "userDetail";

    }
}
