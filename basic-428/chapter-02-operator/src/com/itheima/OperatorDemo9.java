package com.itheima;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //:赋值运算中的操作后赋值的符号蕴含了隐式的强制类型转换.
        byte a = 10;
        a =(byte)(a+20);//(1)a运算的时候会提升为int类型（2）20也是int类型，int+int的结果应用int类型接受，用byte类型接收需要强转.
        System.out.println("a+20的结果强制转换后赋值给a，a是："+a);


        //如是果是写a +=20;那么底层逻辑也是a=a+20;但是发现这个地方不需要左做强转（+=里面包含了隐式的强制转换）
        a +=20;
        System.out.println("a+=20的结果强制转换后赋值给a，a是："+a);


        //这行代码不会出错，a+10.5变成60.5，隐式的强制转华为byte类型，砍掉.5小数位，结果就是60.
        a+=10.5;
        System.out.println("a-=10.5的结果强制转换后赋值给a，a是："+a);
    }
}
