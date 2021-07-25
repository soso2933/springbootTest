package com.coco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-18 15:49
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/say")
    public Object say(String msg){
        return "say:hello springboot"+msg;
    }
}
