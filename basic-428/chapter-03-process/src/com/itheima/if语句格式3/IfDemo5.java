package com.itheima.if语句格式3;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数：");
        int score = sc.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("奖励自行车");
        } else if (score >= 90 && score <= 94) {
            System.out.println("奖励游玩");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励蛋糕");
        } else if (score >= 0 && score <= 79) {
            System.out.println("混合双打");
        } else if (score <= 0 || score >= 100) ;
        {

            //在if...else...if中，else是可选的，更多情况下是用于保底的（也就是当不满足以上的所有情况的时候，对于这种情况使用一种的统一的方案进行处理）
            System.out.println("您输入的小明的分数：" + score + "不符合有效的范围区间！");


        }
        //最后是可以只写else来确定限定的条件情况的；也可以写成else if 来定限定的条件情况相反的内容，⚠️⚠️⚠️注意最后如果使用else if的话，条件应该如何限定.


    }

}

