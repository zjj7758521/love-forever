package com.itheima.while循环;

public class WhileDemo1 {
    public static void main(String[] args) {
        //⚠️while循环,先在while外部初始化一个int类型的值
        int a = 1;
        while (a <=5){
            System.out.println("HelloWorld");
            a++;
        }
        System.out.println("While结束之后，依然可以访问到a的值，a的值是："+a);

        //While循环的初始化的表达式严格意义上来说不归whlie管，所以whlie循环结束之后，a依然可以使用.
        //⚠️for循环的初始化表达是定义在for循环内部的，当for循环结束之后，初始化表达式定义的内容就消失了无法访问了；

    }
}
