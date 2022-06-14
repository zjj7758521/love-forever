package com.itheima.homework;

public class Rectangle {
   // 需求:请定义一个交通工具(Vehicle)的类
    //(1)成员变量
    private int length;
    private int width;

    //(2)成员方法
    public void area(){
        System.out.println("矩形的面积为"+(length*width));
    }

    public void size(){
        System.out.println("矩形的周长为"+((length+width)*2));
    }

    //(3)Set And Get方法


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //（4）空参构造

    public Rectangle() {
    }
    //（5）满参构造

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
