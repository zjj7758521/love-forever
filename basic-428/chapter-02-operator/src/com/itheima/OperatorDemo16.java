package com.itheima;

import sun.jvm.hotspot.utilities.TwoOopHashtable;

public class OperatorDemo16 {
    public static void main(String[] args) {
        //获取最大值的案例：模拟2个学生的分数，获取2个学生中分数中的最大的分数.
        int studentOneScore = 99;
        int studentTwoScore = 100;

        //三元运算符获取两个值中的较大值，根据对布尔表达式的返回的值true/false来进行；
        //写法（1）：
        int maxStudentScore = studentOneScore > studentTwoScore ? studentOneScore :studentTwoScore;
        System.out.println("两个学生中的最大分数是："+maxStudentScore);

        //写法（2）：
        int maxStudentScoreTwo= studentOneScore < studentTwoScore ? studentTwoScore :studentOneScore;
        System.out.println("两个学生中的最大分数是："+maxStudentScore);

        //重点中的重点：分析条件如果是true表示什么意思，如果是fasl表示什么意思=>根据对应的意思指定：前后返回的内容
        //✳️重点是关注较大值，大的表示true（第一个返回写大的值）

        //前后返回的内容数据类型不同，默认要按照最大的数据类型接收
        //例子：double 结果名称 = 条件 ？返回 int : 返回double;   则用double接收.

    }
}
