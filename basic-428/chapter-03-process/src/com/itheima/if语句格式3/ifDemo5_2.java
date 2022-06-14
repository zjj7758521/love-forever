package com.itheima.if语句格式3;

import java.util.Scanner;

public class ifDemo5_2 {
    public static void main(String[] args) {

        //作业练习（2）：打印程序员工龄和工资；
        Scanner sc =new Scanner(System.in);
        System.out.println("输入工龄：");
        int workAge = sc.nextInt();
        System.out.println("输入基本工资");
        int salary = sc.nextInt();

        if(workAge>=10&&workAge<=15){

            System.out.println("您目前工作了"+workAge+"年，基本工资为"+salary+"元，应涨工资为20000元，涨后工资为"+(salary+20000)+"元！");
        }else if(workAge>=5&&workAge<=10){
            System.out.println("您目前工作了"+workAge+"年，基本工资为"+salary+"元，应涨工资为10000元，涨后工资为"+(salary+10000)+"元！");

        }else if (workAge>=3&&workAge<5){
            System.out.println("您目前工作了"+workAge+"年，基本工资为"+salary+"元，应涨工资为5000元，涨后工资为"+(salary+5000)+"元！");
        }
        else if(workAge>=1&&workAge<3){
            System.out.println("您目前工作了"+workAge+"年，基本工资为"+salary+"元，应涨工资为3000元，涨后工资为"+(salary+3000)+"元！");
        }else{
            System.out.println("您输入的数据不在有效范围内，请特殊对待");
        }
    }
}
