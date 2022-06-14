package com.itheima.oom;

//：这个类是手机测试类
public class PhoneTest1 {
    public static void main(String[] args) {

        //当main方法运行的时候创建手机类的对象（通过设计图创建出一个具体存在的事物）
        //创建对象：类名 对象名=new 类名（）；⚠️⚠️
        phone huaweiphone =new phone ();


       //对象如何使用==》"属性"应该如何使用（赋值/取值）
        //⚠️⚠️⚠️格式（1）：对象名.属性名=属性值；（2）属性数据类型 变量名=对象名.属性名  例如：double a =huaweiphone.price
        huaweiphone.price=6999.0;
        huaweiphone.brand="华为P40Pro";

        System.out.println("华为手机的品牌是"+ huaweiphone.brand);
        System.out.println("华为手机的价格是"+ huaweiphone.price);



        //对象如何使用==》"行为"应该如何使用（对象的方法）
        //⚠️⚠️⚠️格式：对象名.方法名（）；
        huaweiphone.call();
        huaweiphone.sendMessage();
        huaweiphone.playGame();
        //此处用对象名，不是类名⚠️⚠️⚠️huaweiphone



    }
}
