package com.itheima.homework;

public class Phone {
    //定义手机类
    //(1)成员变量
    private String brand;
    private String color;
    private double price;
     //(2)成员方法
    public void call(){
        System.out.println("正在使用价格为"+price+'元'+color+'的'+brand+"手机打电话！");

    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+'元'+color+'的'+brand+"手机发短信！");

    }
    //(3)set/get方法


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //(4)无参

    public Phone() {
    }
    //（5）有参

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
}
