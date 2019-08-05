package com.oap.test1.service;

import com.oap.test1.mapper.Student_choose_classMapper;
import com.oap.test1.model.outputModel.CourseClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_choose_classService {

    @Autowired
    private Student_choose_classMapper student_choose_classMapper;



    public void studentChooseClass(String sId, String courseClassId) {
        this.student_choose_classMapper.studentChooseClass(sId, courseClassId);
        this.student_choose_classMapper.course_classPersonNumPlus(courseClassId);
        //Course_classService course_classService = new Course_classService();
        //return course_classService.showStudentCanChooseClassInfo(sId);
    }

    //public List<CourseClassInfo> studentWithdrawalClass(String sId, String courseClassId) {
    public void studentWithdrawalClass(String sId, String courseClassId) {
        this.student_choose_classMapper.studentWithdrawalClass(sId, courseClassId);
        this.student_choose_classMapper.course_classPersonNumSub(courseClassId);
        //Course_classService course_classService = new Course_classService();
        //return course_classService.showStudentChooseClassInfo(sId);
    }
}
