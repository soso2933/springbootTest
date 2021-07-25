package com.coco.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.coco.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-22 12:11
 */
@Controller
public class StuController {
    @Reference(interfaceClass = StuService.class,version = "1.0.0",check = false)
    private StuService stuService;

    @RequestMapping(value = "/stu/count")
    @ResponseBody
    public Object stuCount(){
       Integer count=stuService.queryAllStudentCount();
        return "学生总人数："+count;
    }
}
