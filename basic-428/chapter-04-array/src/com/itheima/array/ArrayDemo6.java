package com.itheima.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //索引的使用方式：数组名称[索引编号]；

        int[] intArrary={10,20,30};

        //⚠️取值（1）找变量接收
        int element0=intArrary[0];
        System.out.println("数组中0索引的元素是："+element0);

        //⚠️取值（2）直接在打印语句中输出
        System.out.println("数组中1索引的元素是："+intArrary[1]);

        //⚠️赋值（1）直接将要赋的值给指定索引
        intArrary[0]=100; //将100值赋值给intArrary数组中的0索引元素.
        System.out.println("数组中0索引的元素是："+element0);
    }
}
