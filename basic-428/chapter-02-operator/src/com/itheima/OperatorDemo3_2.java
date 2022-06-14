package com.itheima;

public class OperatorDemo3_2 {
    public static void main(String[] args) {
        //作业练习题1：手动指定数据的方法求子女身高；
        int fatherHeight = 177;
        int motherHeight = 165;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        System.out.println("儿子的身高预计为：" + sonHeight + "厘米");

        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        System.out.println("女儿的身高预计为：" + daughterHeight + "厘米");


        //作业练习题2：手动指定数据的方法求饭钱；
        int a = 24;
        int b = 8;
        int c = 3;

        int temAmountMoney = a * 3 + b * 3 + c * 5;
        double AmountMoney = (temAmountMoney > 100) ? temAmountMoney * 0.9 : temAmountMoney;
        System.out.println("小明最终需要付的饭钱是：" + AmountMoney + '元');


        //作业练习题3：手动指定数据的方法判断两只老虎的体重是否相同；
        int tigerOneHeinght = 180;
        int tigerTwoHeinght = 200;
        boolean resultOne = tigerOneHeinght == tigerTwoHeinght;
        System.out.println("两只老虎的体重是否相同的结果是："+resultOne);



    }
}
