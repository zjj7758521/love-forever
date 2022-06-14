package com.itheima;

public class OperatorDemo13 {
    public static void main(String[] args) {
        //逻辑符号$ / |
        //例子（1）(2)(3)；
        int a =30;
        boolean resultOne =a % 3 ==0 & a <50;
        System.out.println("30是3的倍数同时还小于50的结果是："+resultOne);

        int b =15;
        boolean resultTwo =b % 3==0 & b >20;
        System.out.println("15是3的倍数同时还大于20的结果是："+resultTwo);

        int c = 25;
        boolean resultThreee = c % 4 ==0 |c <30;
        System.out.println("25是4的倍数或者小于30的结果是："+resultThreee);
    }
}
