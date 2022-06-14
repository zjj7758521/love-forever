package com.itheima.oom;

public class Car {
    //定义汽车类

    //此处有一个快捷键可以连续打出来4个private，⚠️⚠️⚠️ Windows系统：摁住Alt + 鼠标左键下拉.
    // ⚠️⚠️⚠️mac系统：摁住option不放，往下拉（会看到一个黑线就是了）
     private String brand;
     private String color;
     private double price;
     private int seat;


   //（1）在要生成GET/SET方法的实体类中，右键选择Generate(生成）->GETTER AND SETTER->选中要生成的GET/SET方法的成员变量，点击ok即可生成
    //（2）快捷键ALT+Insert(windows)系统，⚠️⚠️⚠️苹果系统：control+n
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

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    //public Car(){
       // System.out.println("Car类的无参构造方法执行了");
   // }
    //：解释上一行代码：右键Generate=>Constructor(构造器）=>SELECT NONE (生成无参构造）⚠️⚠️格式：public Car(){}



    //右键Generate=>Constructor(构造器）=>全部选中（生成满参构造）
    public Car(String brand, String color, double price, int seat) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.seat = seat;
        System.out.println("汽车的品牌是"+this.brand);
        System.out.println("颜色是"+this.color);
        System.out.println("价格是"+this.price+"元！");
        System.out.println("是"+this.seat+"座车！");
    }

    //建议之后无论怎样，都先生成一个满参构造的方法/无参构造的方法（剩余的，根据自己实际情况再去生成）

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("汽车的品牌是："+this.brand+",价格是："+this.price+"元！");
    }
}
