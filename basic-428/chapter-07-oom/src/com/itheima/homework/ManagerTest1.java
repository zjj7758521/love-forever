package com.itheima.homework;

public class ManagerTest1 {
    public static void main(String[] args) {
        //创建对象
        Manager Worker=new Manager();
        //方法一：赋值打印set方法
        Worker.setName("张三");
        Worker.setId(888);
        Worker.setSalary(15000);
        Worker.setBonus(6000);
        Worker.work();

        //方法二：有参构造
        Manager WorkerTwo=new  Manager("李三",999,20000,8000);

        WorkerTwo.work();




    }
}
