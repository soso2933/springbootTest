package com.coco.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-06-24 16:24
 */
@Controller
public class IndexController {
        @RequestMapping(value = "/springboot/one")
        @ResponseBody
        public String say(){
            return "hello ,springboot!!!";
        }
}
