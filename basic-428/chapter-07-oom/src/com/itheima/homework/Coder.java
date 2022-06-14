package com.itheima.homework;

public class Coder {
    //定义程序员类Coder
    //(1)成员变量
    String name;
    int id;
    double salary;
    //(2)成员方法
    public  void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"元的程序员"+name+"正在努力的写着代码");
    }
    //(3)SET方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //（4）无参

    public Coder() {
    }
    //（5）

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
