package com.itheima.oom;

public class DogTest1 {
    public static void main(String[] args) {
        Dog dogOne=new Dog();
        dogOne.setName("大黄");
        dogOne.setAge(12);


        //方式（1）通过set/get的方式输出内容
        System.out.println("昵称是"+dogOne.getName()+"，年龄是"+dogOne.getAge()+"岁的狗，正在帮主人看家护院！");


        //方式（2）通过调用"lookDoor"方法输出内容，⚠️⚠️在Java.bean里面，"lookDoor"方法里面有写打印语句
        dogOne.lookDoor();


    }

}
