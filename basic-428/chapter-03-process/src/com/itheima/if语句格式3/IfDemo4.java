package com.itheima.if语句格式3;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        //减肥计划：键盘录入一个星期数，根据星期数的数据打印对应的减肥计划！
        Scanner sc = new Scanner(System .in) ;
        System.out.println("请您输入一个星期数：");
        int week = sc.nextInt();

        if (week ==1){
            System.out.println("周一吃老北京烤鸭");
        } else if (week ==2){
            System.out.println("周二吃老河北烤鸭");
        }else if (week==3){
            System.out.println("周三吃老上海烤鸭");
        }else if (week==4){
            System.out.println("周四吃老山西烤鸭");
        }else if (week==5){
            System.out.println("周五吃老天津烤鸭");
        }else if (week==6){
            System.out.println("周六吃老山东烤鸭");
        }else if (week==7){
            System.out.println("周日吃老河南烤鸭");
        }else {

            //在if...else...if中，else是可选的，更多情况下是用于保底的（也就是当不满足以上的所有情况的时候，对于这种情况使用一种的统一的方案进行处理）
            System.out.println("您输入的星期数"+week+"有误，地球没饭，去火星吧！");
        }

        //对于多条件的判断测试的时候一般分成三种情况测试：正确数据/边界数据（头/尾）/错误数据



    }
}
