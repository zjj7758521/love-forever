package com.itheima;

public class OperatorDemo2 {
    public static void main(String[] args) {

        //将100赋值给byte类型的变量a    100是整数常量：int

        //Java中有一个机制：常量优化机制，当使用【常量】去给byte/short类型赋值的时候，如果赋的值在其表示范围内，可以不强转；反之需强转.

        byte a = 100;

        System.out.println("a的值是：" + a);

        int b =120;
        //:万能键：Alt + Enter     Option + Return  相当于esciple软件中的ctrl + 1 ;

        //:不是常量，b是一个变量，如果是变量不会走常量优化机制了，不管int表示的是多少，该强转还是强转.

        byte c = (byte) b ;

        System.out.println("c的值是：" + c );

    }
}
