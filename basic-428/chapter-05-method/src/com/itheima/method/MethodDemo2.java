package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //方法定义完成之后需要调用才可以执行.
        //如下为最基本的调用格式⚠️⚠️⚠️（无参数）
        sum();
    }

    //定义一个方法，在方法内部定义两个变量，求出它们的和并打印到控制台
    public static void sum(){
        int a=10;
        int b=20;
        System.out.println("a和b的和是："+(a+b));
    }
}
