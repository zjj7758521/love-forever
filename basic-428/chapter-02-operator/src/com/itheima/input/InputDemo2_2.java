package com.itheima.input;

import java.util.Scanner;

public class InputDemo2_2 {
    public static void main(String[] args) {
        //作业练习（1） 用键盘录入数据的方式求子女身高.
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入父亲身高：");
        int fatherHeight = sc.nextInt();

        System.out.println("请您输入母亲身高：");
        int motherHeight = sc.nextInt();

        double sonHeight = (fatherHeight+motherHeight)*1.08/2;
        System.out.println("儿子的身高预计为："+sonHeight+"厘米");
        double daughterHeight = (fatherHeight*0.923+motherHeight)/2;
        System.out.println("女儿的身高预计为："+daughterHeight+"厘米");

        //作业练习（2） 用键盘录入数据的方式求总的饭钱.
        System.out.println("请您输入鱼香肉丝单价：");
        int a = sc.nextInt();

        System.out.println("请您输入油炸花生单价：");
        int b = sc.nextInt();

        System.out.println("请您输入米饭单价：");
        int c = sc.nextInt();

        int temAmountMoney = a*3+b*3+c*5;
        double AmountMoney =(temAmountMoney > 100)? temAmountMoney*0.9 : temAmountMoney;
        System.out.println("小明最终需要付的饭钱是："+AmountMoney +'元');


        //作业练习题3：键盘录入的方法判断两只老虎的体重是否相同；
        System.out.println("请您输入第一只老虎的体重：");
        int tigerOneWeight = sc.nextInt();
        System.out.println("请您输入第二只老虎的体重：");
        int tigerTwoWeight = sc.nextInt();
        boolean resoulteOne = tigerOneWeight == tigerTwoWeight;
        System.out.println("两只老虎的体重是否相同的结果是："+resoulteOne);


        //作业练习题4：键盘录入的方法判断三个和尚的身高是否相同；
        System.out.println("请您输入第一个和尚的身高：");
        int mongkOneHeight = sc.nextInt();
        System.out.println("请您输入第二个和尚的身高：");
        int mongkTwoHeight = sc.nextInt();
        System.out.println("请您输入第三个和尚的身高：");
        int mongThreeHeight = sc.nextInt();

        int temHeight = mongkOneHeight > mongkTwoHeight ? mongkOneHeight : mongkTwoHeight ;
        int maxHeight = temHeight> mongThreeHeight?  temHeight : mongThreeHeight;
        System.out.println("三个和尚中身高的最大值是："+maxHeight);



    }
}
