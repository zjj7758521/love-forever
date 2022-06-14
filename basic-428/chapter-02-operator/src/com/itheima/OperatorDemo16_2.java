package com.itheima;

public class OperatorDemo16_2 {
    public static void main(String[] args) {
        //获取最小值的案例，4种写法;
        int a = 10;
        int b = 20;

        int minOne = a > b ? b : a;
        System.out.println("取两个值中的最小值为：" + minOne);

        int minTwo = a < b ? a : b;
        System.out.println("取两个值中的最小值为：" + minTwo);

        int minThree = b > a ? a : b;
        System.out.println("取两个值中的最小值为：" + minThree);

        int minFour = b < a ? b : a;
        System.out.println("取两个值中的最小值为：" + minFour);

        //获取最大值的案例，4种写法;
        int maxOne = a > b ? a : b;
        int maxTwo = a < b ? b : a;
        int maxThree = b > a ? b : a;
        int maxFour = b < a ? a : b;
        System.out.println("获取两个值中的最大值为：" + maxOne);
        System.out.println("获取两个值中的最大值为：" + maxTwo);
        System.out.println("获取两个值中的最大值为：" + maxThree);
        System.out.println("获取两个值中的最大值为：" + maxFour);


    }
}
