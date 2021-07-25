package com.coco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-18 15:04
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/springboot/say")
    @ResponseBody
    public  String say(){
        return "hello springboot====";
    }
}
