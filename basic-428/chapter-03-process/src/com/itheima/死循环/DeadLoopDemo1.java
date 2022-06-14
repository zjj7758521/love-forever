package com.itheima.死循环;

public class DeadLoopDemo1 {
    public static void main(String[] args) {

        //死循环：条件判断表达式结果永远为true的循环！=>永远无法满足停止的条件
        //死循环是有意义的，之后学习循环控制的两个关键字（死循环是可以停止的）

        //编译器可以识别的死循环（特点）：编译器识别了死循环之后，死循环后面的代码会变为不可到达的语句；
        //当编译器编译的时候，发现条件恒为true，没有明确的停止条件


        while(true){
            System.out.println("你好");//机器可以识别，但是一直处于循环中，结束不了；
        }
    }
}
