package com.oap.test1.mapper;


import com.oap.test1.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM Student WHERE SID = #{id}")
    Student studentInformationGetById(@Param("id") String id);

}
