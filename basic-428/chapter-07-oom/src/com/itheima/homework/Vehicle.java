package com.itheima.homework;

public class Vehicle {

  //需求:请定义一个交通工具(Vehicle)的类

    //(1)成员变量
    private String brand;
    private String type;

    //(2)成员方法

    public void strat(){
    System.out.println(brand+type+"开始启动！");
   }
    public void run(){
    System.out.println(brand+type+"在高速公路上行驶");
  }
    //(3)setAndGet方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //(4)空参构造

    public Vehicle() {
    }
    //(5)满参构造

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
}
