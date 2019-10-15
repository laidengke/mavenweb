package com.bis.entity;

/*
 * 创建一个持久化类 成员类 Member
 * 实际上 Member 就是一个POJO
 * MyBatis 就是采用 POJO (普通java对象)作为持久化来完成对数据库操作的
 * */
public class Member {
    private Integer id; //主键 id
    private String name; //姓名
    private String sex; //性别

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}