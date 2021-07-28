package com.coco.controller;

import com.coco.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cocoLin
 * @create 2021-07-26 22:19
 */
@Controller
@Slf4j
public class StuController {
        @Autowired
        private StuService stuService;

        @RequestMapping(value = "/stu/count")
        @ResponseBody
        public String stuCount(){

            log.info("查询当前学生的总人数");
           Integer allStudentCount= stuService.queryAllStudentCount();
            return "学生总人数为："+allStudentCount;
        }
}
