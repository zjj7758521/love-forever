package com.itheima.if语句格式2;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {

        //if语句的嵌套的使用：
        //键盘录入三个数据分别赋值给a和b，c，打印三个值中的较大值

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字a的值：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字a的值：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字c的值：");
        int c = sc.nextInt();

        //if的嵌套去完成（判断a,b值的关系）
        if (a > b ){

            //执行到这里能够明确的a的值比b的值要大

            if (a > c ) {

                //执行到这里能够明确的a的值比c的值要大
                System.out.println("最大值是a,a的值是："+ a);

            }else {
                //执行到这里能够明确的c的值比a的值要大
                System.out.println("最大值是c,c的值是："+ c);
            }

        }else {
            //执行到这里能够明确的b的值比a的值要大
            if (b > c ) {
                //执行到这里能够明确的b的值比c的值要大
                System.out.println("最大值是b,b的值是："+ b);
            }else {
                //执行到这里能够明确的c的值比b的值要大
                System.out.println("最大值是c,c的值是："+ c);
            }
        }

    }
}
