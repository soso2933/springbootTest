package com.coco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cocoLin
 * @create 2021-07-25 17:41
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/json/detail")
    @ResponseBody
    public Object userDetail(){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",1001);
        hashMap.put("username","lisi");
        return hashMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPage(Model model){
        model.addAttribute("id",1002);
        model.addAttribute("username","wangwu");
        return "userDetail";
    }
}
