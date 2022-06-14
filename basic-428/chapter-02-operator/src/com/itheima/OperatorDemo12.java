package com.itheima;

public class OperatorDemo12 {
    public static void main(String[] args) {
        //自增自减运算符++ -- 使用方式：写在变量的前面 ++a / --a也可以写在变量的后面，a++   a--;
        //使用场景（1）：单独使用，++a / --a，写在变量的后面，a++   a--效果是一样的
        int b = 0;
        b++;
        System.out.println("单独使用++在后，b的值是："+b );

        ++b;
        System.out.println("单独使用++在前，b的值是："+b );


        //使用场景（2）：混合使用，一行代码中除了++和--之外还有其他的操作.
        //结论（1）：如果混合使用，++/--写在变量的前面，则会先对变量进行自增，再使用自增止之后的结果进行其他操作.
        int c =0;
        System.out.println("c:"+ ++c);
        int d =++c;
        System.out.println("d:"+d +"c:"+c );

        //结论（2）：如果混合使用，++/--写在变量的后面，则会先对变量进行其他操作.操作运算完成之后再进行自增自减.
        int e =0;
        System.out.println("e:"+e++);
        System.out.println("e++在执行完成后："+e);//e先不变，执行完成后在加1.

        int f =e++;//如果++在后，那么先使用e本身的值赋给f；f就是1，执行完赋值操作后，e++自增一次，e就变成了2;
        System.out.println("f:"+f+"e:"+e);

        //总结：之后对于++/--使用最多的情况是单独使用，混合使用容易造成代码阅读困难.
        //:a++先用再加1，++b先加1再用(简单易理解记忆）✳️

        int g =1;
        g=g++;//补充：g的值最终是1，知道了解即可，探讨到汇编语言的层面才知道为什么.
        System.out.println(g );

    }
}
