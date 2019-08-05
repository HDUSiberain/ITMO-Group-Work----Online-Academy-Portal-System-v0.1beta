package com.oap.test1.service;

import com.oap.test1.mapper.CourseMapper;
import com.oap.test1.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<String> showStudentChooseCourseName(String studentId) {
        List<String> studentChooseCourse = new ArrayList<String>();
        for( Course course : this.courseMapper.showStudentChooseCourseName(studentId)) {
            studentChooseCourse.add(course.getCname());
        }
        return studentChooseCourse;
    }

}
