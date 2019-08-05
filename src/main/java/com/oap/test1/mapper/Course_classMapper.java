package com.oap.test1.mapper;

import com.oap.test1.model.Course_class;
import com.oap.test1.model.outputModel.CourseClassInfo;
import com.oap.test1.model.outputModel.CourseClassSimpleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Course_classMapper {

    @Select("SELECT * FROM Course_class")
    List<Course_class> showAllCourse_class();

    @Select("SELECT * FROM Course_class WHERE CCID IN (SELECT CCID FROM Course_class c1, Course_class c2 WHERE c1.CCID = c2.CCID AND c1.CCnum < c2.CCnum_MAX)")
    List<Course_class> showAllCourse_classCanChoose();

    @Select("SELECT Course_class.CCID, Course.Cname, Users.Uname, Course.CID, Course_class.CCnum, Course_class.CCnum_MAX FROM Course, Course_class, Users WHERE Course_class.CID = Course.CID AND Course_class.TID = Users.UID AND Course.CID NOT IN (SELECT CID FROM Course_class WHERE CCID IN (SELECT CCID FROM Student_choose_class WHERE SID = #{id})) AND Course_class.CCID IN (SELECT c1.CCID FROM Course_class as c1, Course_class as c2 WHERE c1.CCID = c2.CCID AND c1.CCnum < c2.CCnum_MAX)")
    List<CourseClassInfo> showStudentCanChooseCourseClassAllInformation(@Param("id") String id);

    @Select("SELECT Course_class.CCID, Course.Cname, Users.Uname, Course.CID, Course_class.CCnum, Course_class.CCnum_MAX FROM Student_choose_class, Course_class, Course, Users WHERE SID = #{id} AND Student_choose_class.CCID = Course_class.CCID AND Course_class.CID = Course.CID AND Course_class.TID = Users.UID")
    List<CourseClassInfo> showStudentChooseAllCourseInformation(@Param("id") String id);

    @Select("SELECT Course.Cname, Users.Uname FROM Student_choose_class, Course_class, Course, Users WHERE Student_choose_class.SID = #{id} AND Student_choose_class.CCID = Course_class.CCID AND Course_class.CID = Course.CID AND Course_class.TID = Users.UID AND Course.Cname = #{cName}")
    CourseClassSimpleInfo showStudentChooseClassSimpleInfo(@Param("id") String id, @Param("cName") String cName);

}
