package com.coco.service;

import com.coco.domain.Student;

/**
 * @author cocoLin
 * @create 2021-07-21 10:51
 */
public interface StuService {

    /**
     * @param student
     * @return
     */
    int updateStudentById(Student student);
}
