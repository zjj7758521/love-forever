package com.itheima;

public class OperatorDemo17 {
    public static void main(String[] args) {
        //1.声明三个和尚的身高值（定义三个变量）；

        int mongkOneHeight = 150;
        int mongkTwoHeight = 165;
        int mongkThreeHeight = 210;

        //2.先让第一个和尚和第二个和尚的身高对比获取到较大值后赋值给一个临时变量temHeight.
        int temHeight = mongkOneHeight > mongkTwoHeight ? mongkOneHeight : mongkTwoHeight ;

        //3.temHeight实际上就是第一个和尚和第二个和尚的较大值，对比后，再让temHeight赋值给maxHeight;
        int maxHeight = temHeight> mongkThreeHeight?  temHeight : mongkThreeHeight ;

        System.out.println("三个和尚中身高的最大值是："+maxHeight);



    }
}
