package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapperAnnotation {

    //使用注解法无需xml映射文件
    @Select("select * from tbl_employee where id=#{id}")
    public Employee getEmpById(Integer id);
}
