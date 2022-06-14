package com.itheima;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //+的特殊性：关于字符串使用+的效果，
        //特点：从左向右依次执行，如果左右不是字符串，那就是算数运算符.

        System.out.println(1+99+"黑马");
        System.out.println("黑马"+1+99+'年');


        //如果想在拼接之前就完成算数运算，可以加上（）,提升运算的优先级
        System.out.println("5 * 6的结果是：" +(5 *6));
        System.out.println("5 - 6的结果是：" +(5 -6));

    }
}
