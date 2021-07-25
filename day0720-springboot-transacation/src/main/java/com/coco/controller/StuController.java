package com.coco.controller;

import com.coco.domain.Student;
import com.coco.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-21 10:46
 */
@Controller
public class StuController {
    @Autowired
    private StuService stuService;
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount=stuService.updateStudentById(student);
        return "修改学生编号为"+id+"的姓名修改结果"+updateCount;
    }
}
