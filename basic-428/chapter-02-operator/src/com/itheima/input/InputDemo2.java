package com.itheima.input;

import java.util.Scanner;

public class InputDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输s入第一个学生的成绩：");
        //:⚠️当能够明确一个式子或者一个方法有返回值的时候，可以使用万能键（option+return），自动生成变量进行接收.
        int studentOneScore = sc.nextInt();

        System.out.println("请您输s入第二个学生的成绩：");
        int studentTwoScore = sc.nextInt();

        //：⚠️直接在输入语句中填写三元表达式，直接将结果打印出来.
        System.out.println("两个学生中的最高分是：" + (studentOneScore > studentTwoScore ? studentOneScore : studentTwoScore) + "分！");


        //:⚠️代码格式化快捷键"command+ option+ L"

        //:⚠️复制当前行代码"command + D


    }

}
