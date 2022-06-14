package com.itheima.homework;

public class Manager {
    //  定义项目经理类Manager
    //(1)成员变量
    String name;
    int id;
    double salary;
    double bonus;
    //(2)成员方法
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"元，奖金为"+bonus+"元的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码..... ");
    }
    //（3）set方法

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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    //（4）无参构造方法

    public Manager() {
    }


    //（5）有参构造方法


    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
}
