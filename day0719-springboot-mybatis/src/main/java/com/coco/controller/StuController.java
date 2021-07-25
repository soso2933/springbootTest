package com.coco.controller;

import com.coco.controller.service.StudentService;
import com.coco.domain.Student;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-20 11:09
 */
@Controller
public class StuController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/stu")
    @ResponseBody
    public Object student(Integer id){
        Student student=studentService.queryStudentById(id);
        return student;
    }
}
