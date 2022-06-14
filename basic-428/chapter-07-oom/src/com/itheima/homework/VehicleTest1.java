package com.itheima.homework;

import static sun.misc.PostVMInitHook.run;

public class VehicleTest1 {
    public static void main(String[] args) {

        //无参构造，创建Vehicle对象Porsche
        Vehicle Porsche=new Vehicle();
        //方式一：空参构造创建对象,set方法赋值,get方法获取实现；
        Porsche.setBrand("保时捷");
        Porsche.setType("跑车");
        System.out.println(Porsche.getBrand()+Porsche.getType()+"开始启动");
        System.out.println(Porsche.getBrand()+Porsche.getType()+"高速公路上行驶！");

        //方式二：满参构造直接创建对象
        Vehicle PorscheTwo=new Vehicle("保时捷","跑车，");
        Porsche.strat();
        Porsche.run();


    }




}
