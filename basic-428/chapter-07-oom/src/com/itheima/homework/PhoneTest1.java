package com.itheima.homework;

public class PhoneTest1 {
    //定义手机类
    public static void main(String[] args) {
        //创建对象
        Phone xiaoMI=new Phone();
        //set方法赋值
        xiaoMI.setBrand("小米");
        xiaoMI.setColor("黑色");
        xiaoMI.setPrice(3998);
        xiaoMI.call();
        xiaoMI.sendMessage();
    }
}
