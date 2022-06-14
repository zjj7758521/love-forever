package com.itheima.死循环;

public class DeadLoopDemo2 {
    public static void main(String[] args) {

        //死循环：条件判断表达式结果永远为true的循环！=>永远无法满足停止的条件，⚠️⚠️⚠️打印不出来任何东西，一直在执行循环

        //译器不可以识别的死循环（特点）：编译器不能识别，可以在这种死循环后面的写代码；

        int a =1;
        while (a<20){

        }

        //编译器只会认为这是一个循环，不会去读取你的代码，a如果不改变，恒小于20 ，循环可以一直执行下去（死循环）
        System.out.println("你好");
    }
}
