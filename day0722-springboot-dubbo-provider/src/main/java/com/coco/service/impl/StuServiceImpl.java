package com.coco.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coco.service.StuService;
import org.springframework.stereotype.Component;

/**
 * @author cocoLin
 * @create 2021-07-22 12:20
 */
@Component
@Service(interfaceClass = StuService.class,version = "1.0.0",timeout = 18000)
public class StuServiceImpl implements StuService {
    @Override
    public Integer queryAllStudentCount() {
        return 1250;
    }
}
