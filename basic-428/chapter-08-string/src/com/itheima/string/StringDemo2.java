package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String a=new String("abc");
        String b="abc";
        String c="abc";
        char[] chars={'a','b','c'};
        String d=new String(chars);
        String e="ab";
        String f=e+"c";
        String g="ab"+"c";
        //以上字符串的内容a/b/c/d/e/f/g都是什么？ 是"abc"

        //通过String内存的初始化方式==比较引用数据类型的比较的是地址值是可以推算出来的
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(a==e);
        System.out.println(a==f);
        System.out.println(a==g);

        System.out.println("==============分隔符");
        System.out.println("b==c");
        System.out.println("b==d");
        System.out.println("b==f");
        System.out.println("b==g");//true
        System.out.println("==============分隔符");
        System.out.println("c==d");
        System.out.println("c==f");
        System.out.println("c==g");//true
        System.out.println("==============分隔符");
        System.out.println("d==f");
        System.out.println("d==g");
        System.out.println("==============分隔符");
        System.out.println("f=g");

        //结论：通过构造方法创建出来的对象，new进堆
        //通过常量赋值的方法进常量池
        //拼接对象的过程中，如果有变量，就是进堆
        //拼接对象的过程中，没有变量，就是采用常量优化机制，忽略拼接字符，在常量池中

    }
}
