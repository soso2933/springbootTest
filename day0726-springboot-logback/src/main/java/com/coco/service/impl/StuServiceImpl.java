package com.coco.service.impl;

import com.coco.dao.StudentMapper;
import com.coco.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cocoLin
 * @create 2021-07-26 22:25
 */
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Integer queryAllStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
