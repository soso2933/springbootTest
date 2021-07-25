package com.coco.controller;

import com.coco.domain.Student;
import com.coco.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cocoLin
 * @create 2021-07-21 18:14
 */
@RestController
public class StuController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public  Object put(String key,String value){
        studentService.put(key,value);
        return "值已经放入redis";
    }

    @RequestMapping(value = "/get")
    public String get(String key){

        String value=studentService.get(key);
        return "redis中count："+value;
    }
}
