package com.coco.web;

import com.coco.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-18 17:36
 */
@Controller
public class IndexController {
    /*@Value("${school.name}")
    private String school;*/

    @Autowired
    private School school;
    @RequestMapping(value = "/say")
    @ResponseBody
    public  String say(){

        return "school.name++++++==========="+school.getName();
    }
}
