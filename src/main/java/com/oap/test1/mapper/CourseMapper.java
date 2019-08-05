package com.oap.test1.mapper;

import com.oap.test1.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM Course WHERE CID IN (SELECT CID FROM Course_class WHERE CCID IN (SELECT CCID FROM Student_choose_class WHERE SID = #{id}))")
    List<Course> showStudentChooseCourseName(@Param("id") String id);

}
