package com.itheima.api;
import java.util.Scanner;

public class ApiDemo3 {
    public static void main(String[] args) {
        //通过描述明确了Scanner类是一个扫描功能的类,根据指定的扫描源去扫描指定的数据并解析.
        //通过查看构造方法明确,必须在创建Scanner对象的时候指定扫描源,指定System.in(扫描控制台输入的数据)
        Scanner sc = new Scanner(System.in);

        //(1)先录入一个数字
        System.out.println("请您录入一个数字:");
        int i = sc.nextInt();
        //(2)再录入一个字符串
        System.out.println("请您再录入一个数字:");
        int ii = sc.nextInt();

        System.out.println("键盘录入的数字信息是:" + i);
        System.out.println("键盘录入的数字信息2是:" + ii);

    }
}
