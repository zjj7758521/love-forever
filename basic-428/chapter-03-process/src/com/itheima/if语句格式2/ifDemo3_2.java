package com.itheima.if语句格式2;

import java.util.Scanner;

public class ifDemo3_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System .in) ;
        //作业练习1：键盘录入的方式求三个值中的最大值

        System.out.println("输入数字a");
        int a = sc.nextInt();
        System.out.println("输入数字b");
        int b = sc.nextInt();
        System.out.println("输入数字c");
        int c  = sc.nextInt();

        if (a>b ){
            if (a>c){
                System.out.println("a的值最大，a的值是："+a);
            }else{
                System.out.println("c的值最大，c的值是："+c);
            }
        }else{
            if (b>c){
                System.out.println("b的值最大，b的值是："+b);
            }else{
                System.out.println("c的值最大，c的值是："+c);
            }
        }
    }
}
