package com.itheima.process;




public class SwitchDemo1 {
    public static void main(String[] args) {
        //switch语句注意事项⚠️⚠️⚠️
        //switch语句（）中的内容可以是常量/变量/ 表达式
        //case后面的内容只能是常量，不可以是变量，不可以是long/double/float/布尔类型

        //switch语句相比较if语句能够判断的内容有固定的限制，只能用于以下几种数据类型的判断⚠️⚠️
        //byte/short/int/char/String(字符串）/Enum(枚举)



        //switch语句定义7天减肥计划
        int week=8;
        switch(week){
            case 1:
            System.out.println("星期一吃老北京烤鸭");
            break;
            case 2:
                System.out.println("星期二吃老北京烤鸭");
            break;
            case 3:
             System.out.println("星期三吃老北京烤鸭");
            break;
             case 4:
                 System.out.println("周四吃老山西烤鸭");
            break;
            case 5:
                System.out.println("周五吃老天津烤鸭");
           break;
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

