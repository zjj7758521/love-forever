package com.itheima.oom;

public class Dog {
    //实体类：狗类
    private  String name;
    private  int age;

    //:control+n快捷键创建set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void lookDoor(){
        System.out.println("昵称是"+this.name+"，年龄是"+this.age+"岁的狗正在帮主人看家护院！");
    }
}
