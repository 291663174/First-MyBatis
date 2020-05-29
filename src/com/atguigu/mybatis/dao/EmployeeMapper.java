package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;

public interface EmployeeMapper {

    //  接口式编程有很多的好处，接口规定的方法拥有更强的类型检查，传Integer就不能传Double类型
    //  接口本身就是一个抽象，抽出了规范
    //  接口实现用mabatis
    public Employee getEmpById(Integer id);

}
