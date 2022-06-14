package com.itheima.string;

import java.util.Scanner;

public class StringDemo4 {
    //模拟用户登陆，需要输入用户名/密码/验证码，登陆成功后用户可以发一句话，如果发送的有"TMD"则输出另外一句坏重新录入
    public static void main(String[] args) {
        //(1)模拟定义用户信息
        String name = "玛丽亚";
        String password = "mly1234";
        String code = "Qwer";
        //(2)键盘录入的方式用户输入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String loginUsername = sc.nextLine();
        System.out.println("请输入密码：");
        String longinPassword = sc.nextLine();
        System.out.println("请输入验证码：");
        String longinCode = sc.nextLine();
        //(3)比较验证码是否相同
        if (!longinCode.equalsIgnoreCase(code)) {
            System.out.println("您输入的验证码有误，请重新输入!");
            return;//需解释⚠️♥️在没有返回值的方法表示方法结束（不需要再向下进行判断了）
        }
            //（4）进行用户名和密码的同时比较，并且的关系连接并进行判断
            if (name.equals(loginUsername) && password.equals(longinPassword)) {
                //（5）再让用户录入一句话，录入完成之后，判断是是否包含敏感词，包含则提示，不包含则发送
                System.out.println("欢迎"+name+"请输入您想说的话");
                String say = sc.nextLine();
                if (say.contains("TMD")) {
                    System.out.println("您可太没素质了，团成团请您出去");
                } else {
                    System.out.println("用户" + name + "对大家说" + say);
                }
            } else {
                System.out.println("您输入的用户名或者密码错误，请重新输入");
            }

        }
    }
