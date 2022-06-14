package com.itheima.api;

import java.util.Scanner;

public class ApiDemo1 {
    //需求：先录入一个nextline
    public static void main(String[] args) {
        //通过描述明确了Scanner类是一个扫描功能的类,根据指定的扫描源去扫描指定的数据并解析.
        //通过查看构造方法明确,必须在创建Scanner对象的时候指定扫描源,指定System.in(扫描控制台输入的数据)
        Scanner sc=new Scanner(System.in);

        System.out.println("请录入一个字符串");
        String info = sc.nextLine();
        System.out.println("键盘录入的字符串是："+info);


        //通过查看Scanner类的成员方法,提供解析各种各样数据的方法.
        //(1)public int nextInt() : 解析录入的数字转换为一个int结果返回.
        //(2)public double nextDouble() : 解析录入的数字转换为一个double结果返回.
        //(3)public String nextLine() : 解析录入的一行字符串数据转换为一个String结果返回.
        String info2 = sc.nextLine();
        System.out.println("键盘录入的字符串信息是:" + info2);


    }







}
