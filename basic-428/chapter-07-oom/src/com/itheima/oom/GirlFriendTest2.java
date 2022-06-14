package com.itheima.oom;

public class GirlFriendTest2 {
    public static void main(String[] args) {
        //当声明的类中的成员变量，没有指定初始化值的时候，在创建对象的时候系统会给出默认值
        //如果对象的属性是基本数据类型  整数：0/小数：0.0/字符：空字符/布尔：false
        //如果对象的属性是引用数据类型 引用类型：null
        GirlFriend muse=new GirlFriend();
        System.out.println("创建对象缪斯女神时默认值为"+ muse.name);//String是一个引用数据，默认值为null
        System.out.println("创建对象缪斯女神时默认值为"+muse. height);
        System.out.println("创建对象缪斯女神时默认值为"+muse.weight);
        System.out.println("创建对象缪斯女神时默认值为"+muse.money);
    }
}
