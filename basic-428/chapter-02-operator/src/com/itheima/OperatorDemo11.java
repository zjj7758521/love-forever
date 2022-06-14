package com.itheima;

public class OperatorDemo11 {
    public static void main(String[] args) {
        //对于> >= < <=使用的方式和==以及！=是一样的，注意boolean类型不能使用> >= < <=进行比较；

        int a = 10;
        int b = 20;
        byte c= 10;

        System.out.println("a>b的结果是："+(a>b));
        System.out.println("a>=b的结果是："+(a>=b));
        System.out.println("a>c的结果是："+(a>c));
        System.out.println("a>=c的结果是："+(a>=c));

        //剩余内容举一反三即可（时刻明确：关系运算符进行运算之后，肯定会得到一个boolean类型的结果！）




    }
}
