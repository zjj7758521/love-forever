package com.itheima.process;


public class SwitchDemo2 {
    public static <string> void main(String[] args) {
        //switch语句可以用于byte/short/int/char/String(字符串）/Enum(枚举)这几种数据类型
        //Enum(枚举)就业班会讲到
        //char类型的switch如何判断
        int c ='A';
        switch(c){
            case 'a':
                System.out.println("字符c是a");
                break;
            case 'A':
                System.out.println("字符c是A");
                break;
            case '我':
                System.out.println("字符c是我 ");
                break;
            default:
                System.out.println("您输入的字符有误");
                break;

        }

        //String类型的switch如何判断
        switch("学习"){
            case"喝酒":
                System.out.println("喝酒");
                break;
            case"学习":
                System.out.println("学习");
                break;
        }





    }
}
