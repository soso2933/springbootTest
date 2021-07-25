package com.coco.controller;

import com.coco.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cocoLin
 * @create 2021-07-21 12:58
 */
@RestController
public class StuController {

    @RequestMapping(value = "/student")
    public Object student(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;

    }

    @RequestMapping(value = "/student/detail/{id}/{age}")
    public Object student1(@PathVariable ("id") Integer id,
                           @PathVariable ("age")  Integer age
                           ){
        Map<String,Object> retMap=new HashMap<>();
        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;

    }
}
