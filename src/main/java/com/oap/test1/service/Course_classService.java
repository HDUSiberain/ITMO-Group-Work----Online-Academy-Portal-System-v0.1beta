package com.oap.test1.service;

import com.oap.test1.mapper.Course_classMapper;
import com.oap.test1.model.outputModel.CourseClassInfo;
import com.oap.test1.model.outputModel.CourseClassSimpleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Course_classService {

    @Autowired
    private Course_classMapper course_classMapper;

    public CourseClassSimpleInfo showStudentChooseClassSimpleInfo(String studentId, String courseName) {
        return this.course_classMapper.showStudentChooseClassSimpleInfo(studentId, courseName);
    }

    public List<CourseClassInfo> showStudentChooseClassInfo(String studentId) {
        return this.course_classMapper.showStudentChooseAllCourseInformation(studentId);
    }

    public List<CourseClassInfo> showStudentCanChooseClassInfo(String studentId) {
        return this.course_classMapper.showStudentCanChooseCourseClassAllInformation(studentId);
    }


}
