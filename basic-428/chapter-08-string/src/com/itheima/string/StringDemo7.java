package com.itheima.string;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //需求：输入一个字符串，统计字符串中大写字母/小写字母/数字分别出现的次数并打印
        //（1）键盘录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入一个字符串是：");
        String infor = sc.nextLine();
        //(2)将字符串转换为字符数组
        char[] chars = infor.toCharArray();
        //(3)定义三个计数器，分别初始化值为0
        int upperCaseCount=0,lowerCaseCount=0,numberCount=0;
        //(4)遍历数组，统计三个变量出现的次数
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if(ch >='0'&& ch <='9'){
                numberCount++;

            }else if (ch >='A'&& ch <='Z'){
                upperCaseCount++;

            }else if (ch >='a'&& ch <='z'){
                lowerCaseCount++;


            }


        }
        //(5)打印字符出现次数
        System.out.println("字符串中大写字母出现的次数为："+upperCaseCount+"，小写字母出现的次数为："+lowerCaseCount+"，数字出现的次数为："+numberCount+"次！");
    }
}
