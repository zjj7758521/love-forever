package com.itheima.if语句格式2;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //键盘录入两个数据分别赋值给a和b,打印a的值和b的值的关系.
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字a的值：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字a的值：");
        int b = sc.nextInt();


        //条件其实很灵活
        //写法（1）⚠️核心：能够明确条件返回true/false表达的具体含义是什么，再去对应的代码块中给出结论
        if (a > b) {
            //执行到这个地方=》a>b：true（a的值大于b的值）
            System.out.println("a的值大于b的值！");

        }else {
            //执行到这个地方 =》a>b：false （a的值不大于b的值）
            System.out.println("a的值不大于b的值");
        }

        //写法2：
        if (a < b ){
            System.out.println("a的值小于b的值！");

        }else {
            System.out.println("a的值大于等于b的值！");
        }


    }
}
