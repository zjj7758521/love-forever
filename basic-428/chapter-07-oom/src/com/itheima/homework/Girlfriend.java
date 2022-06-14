package com.itheima.homework;

public class Girlfriend {
    //定义一个女朋友类
    //(1)成员变量
    private String name;
    private double height;
    private double weight;
    //(2)成员方法
    public void wash(){
        System.out.println(name+"帮我洗衣服");
    }
    public void cook(){
        System.out.println(name+"给我做饭");
    }
    //定义一个展示3个属性值的方法
    public void show(){
        System.out.println("我女朋友叫"+name+",身高"+height+"厘米，体重"+weight+"斤！");
    }

    //（3）提供get/set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //(4)空参构造

    public Girlfriend() {
    }
    //（5）满参构造

    public Girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
