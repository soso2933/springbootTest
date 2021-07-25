package com.coco.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.coco.domain.Student;
import com.coco.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cocoLin
 * @create 2021-07-23 13:02
 */
@Controller
public class StuController {
    @Reference(interfaceName ="com.coco.service.StuService",version = "1.0.0",check = false)
    private StuService stuService;
    @RequestMapping(value = "/stu/detail/{id}")
    public String stuDetail(Model model, @PathVariable ("id") Integer id){
        Student student=stuService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";


    }
}
