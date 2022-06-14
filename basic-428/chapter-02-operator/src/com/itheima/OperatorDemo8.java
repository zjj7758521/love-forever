package com.itheima;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //赋值运算符：将右边的数值赋值给左边，而且两边的数据类型要匹配
        //看的方式是从右往左看

        int a = 100;//将100的值赋给int类型的a

        //+=:加后赋值 数A+=数；执行流程：先将A和B的值相加，再将结果赋值给A.
        a+=20;
        System.out.println("a+=20之后a的结果是："+a );

        //-=:减后赋值
        a-=10;
        System.out.println("a-=20之后a的结果是："+a );

        //*=:
        a*=3;
        System.out.println("a*=3之后a的结果是："+a ) ;

        ///=:
        a /=10;
        System.out.println("a/=10之后a的结果是："+a );

        //%:
        a %=3;
        System.out.println("a%=3之后a的结果是："+a );
    }
}
