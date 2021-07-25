package com.coco.springboot.controller;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cocoLin
 * @create 2021-07-18 15:20
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say:Hello springboot----====";
    }

    @RequestMapping(value = "/map")
    @ResponseBody
    public Map<String,Object> map(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg","hello springboot==");
        return map;
    }


}
