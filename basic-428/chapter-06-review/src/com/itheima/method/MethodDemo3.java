package com.itheima.method;

public class MethodDemo3 {
    public static void main(String[] args) {


        byte a=10,b=20;
        short c=10,d=20;
        int e=10,f=20;
        long g=10L,h=20L;
        //作为调用者，只需要明确一个方法叫做Sum,可以计算两个整数类型的数据求和即可，具体调用哪个由Java虚拟机自动去判断，不需要手动去选择
        sum(a,b);
        sum(c,d);
        sum(e,f);
        sum(g,h);




    }

    //通过方法重载定义方法，定义的方法可以兼容全部的整数类型计算求和
    //总共有四类整数的基本类型，最起码要提供4个方法分别去计算byte/short/int/long数据的相加
    //又因为这些方法的目的都是为了求和，降低调用者的学习成本，可以将这些方法的方法名称定义为相同的
    public static void sum(byte a,byte b){
        System.out.println("(byte):a+b的和是："+(a+b)+'.');
    }

    public static void sum(short a,short b){
        System.out.println("(short):a+b的和是："+(a+b)+'.');
    }

    public static void sum(int a,int b){
        System.out.println("(int):a+b的和是："+(a+b)+'.');
    }

    public static void sum(long a,long b){
        System.out.println("(long):a+b的和是："+(a+b)+'.');
    }
}
