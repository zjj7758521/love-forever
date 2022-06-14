package com.itheima.homework;

public class RectangleTest1 {
    //需求:请定义一个交通工具(Vehicle)的类
    public static void main(String[] args) {
        //创建对象为RectangTarget
        Rectangle RectangTarget=new Rectangle();

        //方法一：空参构造创建对象,set方法赋值
        RectangTarget.setLength(8);
        RectangTarget.setWidth(6);
        RectangTarget.area();
        RectangTarget.size();

        //方法二：满参构造直接创建对象
        Rectangle RectangTargetTwo=new Rectangle(9,7);
        RectangTargetTwo.area();
        RectangTargetTwo.size();









    }

}
