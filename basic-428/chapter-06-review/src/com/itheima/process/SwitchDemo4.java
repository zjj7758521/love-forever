package com.itheima.process;

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //case穿透案例：
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入一个月份");
        int month = sc.nextInt();

        switch(month){
            case 11:
            case 12:
            case 1:
                System.out.println("您输入的"+month+"月是冬天");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("您输入的"+month+"月是冬天");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("您输入的"+month+"月是冬天");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("您输入的"+month+"月是冬天");
                break;
            default:
                System.out.println("您输入的"+month+"月违法");
                break;



        }
    }
}
