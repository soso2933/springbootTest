package com.coco.controller;

import com.coco.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cocoLin
 * @create 2021-07-27 22:37
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public String userDetail(Model model){
        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        user.setAge(23);
        model.addAttribute("user",user);
        return "user";
    }
}
