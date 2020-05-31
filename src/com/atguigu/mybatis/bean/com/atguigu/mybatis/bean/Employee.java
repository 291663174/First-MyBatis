package com.atguigu.mybatis.bean;

import org.apache.ibatis.type.Alias;

@Alias("emp")              //批量起别名情况下使用Alias注解，为Employee类起别名，避免与子类同名文件冲突
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;

    public Employee() {
        super();
    }

    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\''  +
                 ']';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
