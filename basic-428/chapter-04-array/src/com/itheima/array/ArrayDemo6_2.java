package com.itheima.array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ArrayDemo6_2 {
    public static void main(String[] args) {
        //索引的使用方式：数组名称[索引编号]；
        //需求：通过动态初始化创建一个长度为3的int数组，先通过索引获取到数组中的每一个元素打印出来，再将100赋值给数组的0索引，200赋值给数组的1索引之后，重新获取到数组中的每一个元素打印出来

        int[] intArray= new int[3];

        int element0=intArray[0];//索引取值的方式：找一个变量值接收然后打印；
        System.out.println("数组中0索引的元素是："+element0);//其实可以直接打印出来索引对应的值；

        int element1=intArray[1];
        System.out.println("数组中1索引的元素是："+element1);


        int element2=intArray[2];
        System.out.println("数组中2索引的元素是："+element2);

        int yuanSuOne=100;
        int yuanSuTwo=200;


        System.out.println("数组中0索引的元素是："+yuanSuOne);
        System.out.println("数组中1索引的元素是："+yuanSuTwo);


        System.out.println("数组中0索引的元素是："+intArray[0]);//直接在打印语句中输出索引


    }
}
