package com.itheima.homework;

import java.util.Scanner;

public class HomeworkDemo2 {
    public static void main(String[] args) {
        //请编写程序，由键盘录入一个字符串，统计字符串中英文字母大写的有多少个,小写的有多少个和数字分别有多少个。
        //比如：Hello12345World中 大写字母:2个 小写字母:8个 数字:5个

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int upterCount=0,lastCount=0,numberCount=0;
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if(ch>='0'&& ch<='9'){
                numberCount++;

            }else if (ch>='a'&& ch<='z'){
                lastCount++;

            }else if (ch>='A'&& ch<='Z'){
                upterCount++;

            }



        }
        System.out.println("字符串中大写字母出现的次数为："+upterCount+"，小写字母出现的次数为："+lastCount+"，数字出现的次数为："+numberCount+"次！");



    }
}
