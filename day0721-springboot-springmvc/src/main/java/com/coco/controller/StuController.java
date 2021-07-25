package com.coco.controller;

import com.coco.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-21 11:16
 */
@Controller
public class StuController {

    @RequestMapping(value = "/student")
    @ResponseBody
    public Object student(){
        Student student = new Student();
        student.setId(111);
        student.setName("zhangsan");
        return student;
    }

    //@RequestMapping(value = "/queryStudent2",method = RequestMethod.GET)
    @ResponseBody
    @PostMapping(value = "queryStudent2")
    public Object queryStudent2(){
        return "Only get";
    }
}
