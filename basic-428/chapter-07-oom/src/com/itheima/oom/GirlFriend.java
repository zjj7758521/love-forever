package com.itheima.oom;

public class GirlFriend {

    //成员变量（属性）所有女朋友具备的属性===》数据类型 变量名称；
    String name;
    double height;
    double weight;
    double money;


    //成员方法（行为）所有女朋友具备的行为⚠️⚠️不需要返回，所以此处用void即可，注意不用写static
    //public void 方法名（）
    public void shopping(double money){
        System.out.println("女朋友正在购物");
    }
    public void watchingTV(){
        System.out.println("女朋友正在看电视");
    }
    public void sleep(){
        System.out.println("女朋友正在睡觉");
    }
}
