package com.itheima.for循环;

import java.util.Scanner;

public class ForDemo6_3 {
    public static void main(String[] args) {
        //作业练习（4）：键盘录入大于100的三位树，并满足如下要求，求和思想.1.数字的个位数不为7;
        //		2.数字的十位数不为5;
        //		3.数字的百位数不为3;
        //⚠️⚠️⚠️需求说明输入的数据大于100，那么初始化值从int a =100开始即可；
        Scanner sc =new Scanner(System.in);
        System.out.println("请您输入一个3位数字");
        int input = sc.nextInt();
        int sum =0;

        for (int a =100;a<=input;a++){
            int b = a /100 %10;
            int s = a /10 %10;
            int g = a /1 %10;

            //不等于的符号为：！=
            if (b !=3&&s!=5&& g!=7){
                sum+=a ;
                System.out.println("数字"+a+"就是一个符合条件的数！");


            }



        }
        System.out.println("满足条件的数字之和是"+sum);


    }
}
