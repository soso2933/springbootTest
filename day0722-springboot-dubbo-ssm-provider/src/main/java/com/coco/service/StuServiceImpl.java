package com.coco.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.coco.dao.StudentMapper;
import com.coco.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cocoLin
 * @create 2021-07-23 13:09
 */
@Component
@Service(interfaceName = "com.coco.service.StuService",version = "1.0.0",timeout = 15000)
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
