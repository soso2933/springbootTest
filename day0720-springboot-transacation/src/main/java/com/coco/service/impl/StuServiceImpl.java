package com.coco.service.impl;

import com.coco.dao.StudentMapper;
import com.coco.domain.Student;
import com.coco.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cocoLin
 * @create 2021-07-21 10:52
 */
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;


    @Override
    @Transactional
    public int updateStudentById(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
        return i;
    }
}
