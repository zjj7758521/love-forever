package com.itheima.api;


import java.util.Scanner;

public class ApiDemo2 {
    //需求：先录入一个nextint,再nextline
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数字" );
        int i = sc.nextInt();
        System.out.println("您输入的数字是："+i);
        System.out.println("输入一个字符串");
        String s = sc.nextLine();
        System.out.println("您输入的字符串是："+s);

        //数字的默认分隔符是空格，放到暂存区
        //字符串默认的分隔符是回车，⚠️输入一个字符串然后回车会把内容全部读取. 不会把回车放到暂存区.所以下一次录入暂存区中没内容就可以继续录入了.
        //⚠️⚠️解决方案：先输入字符串，再输入数字即可
    }

}
