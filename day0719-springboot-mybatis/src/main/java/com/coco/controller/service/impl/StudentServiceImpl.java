package com.coco.controller.service.impl;

import com.coco.controller.service.StudentService;
import com.coco.dao.StudentMapper;
import com.coco.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cocoLin
 * @create 2021-07-20 11:16
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
       return studentMapper.selectByPrimaryKey(id);
    }
}
