package com.itheima.if语句格式1;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //.if语句格式一的练习;只需要判断一种情况，只打印true的情况，如果是false则不打印

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字a:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字b:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字c");
        int c = sc.nextInt();

        //if判断的条件：如果a和b相等 = > 关系运算符中的==来对两个数据进行判断，这个式子也会返回一个boolean值（if判断的套件）;
        //条件必须是可以返回boolean值，小括号和大括号之间没有分号；（如果大括号里面只有一个语句可以省略大括号，多个不可以省略，慎用）;
        if (a == b ) {
            System.out.println("a的值和b的值相等！");
        }
        if(a == c ){
            System.out.println("a的值和c的值相等！");

        }

        //如果a是3的倍数，打印a是3的倍数；分析：a是3的倍数 = > a % 3 == 0 ,可以将这个式子作为if判断的条件；
        if (a % 3 == 0){
            System.out.println("a是3的倍数！");
        }

        //如果b是4的倍数，打印；
        if (b % 4 == 0){
            System.out.println("b是4的倍数");
        }

    }
}
