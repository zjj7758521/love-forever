package com.itheima.entity;

public class TargetStudent {
    //1成员变量
    private String name;
    private String address;
    private String gender;
    private String university;
    //2成员方法
    public void show(){
        System.out.println("学生的姓名是："+name+"，学生的籍贯是："+address+",学生的性别是："+gender+",学生的学校名称是："+university);
    }
    //3setAndget方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    //4无参构造

    public TargetStudent() {
    }
    //5有参构造


    public TargetStudent(String name, String address, String gender, String university) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.university = university;
    }
}
