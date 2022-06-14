package com.itheima.process;

public class SwitchDemo3 {
    public static void main(String[] args) {

        //⚠️⚠️⚠️csae穿透：去掉break后，即便到了目标值3那，也会一直打印4，5，6，7的内容；如果中途在6那加了break，那么在这个位置会停止穿透，打印3，4，5，6的内容
        int week=3;
        switch(week){
            case 1:
                System.out.println("星期一吃老北京烤鸭");

            case 2:
                System.out.println("星期二吃老北京烤鸭");

            case 3:
                System.out.println("星期三吃老北京烤鸭");

            case 4:
                System.out.println("周四吃老山西烤鸭");

            case 5:
                System.out.println("周五吃老天津烤鸭");

            case 6:
                System.out.println("周六吃老山东烤鸭");
                break;
            case 7:
                System.out.println("周日吃老河南烤鸭");
                break;

            default:
                System.out.println("您输入的星期数"+week+"有误，地球没饭，去火星吧！");
                break;
        }

    }
}
