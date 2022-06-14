package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo3 {
    public static void main(String[] args) {
        //需求：键盘录入一个数组的长度，并且创建对应的长度的数组，然后录入要生成的随机数的范围（最小值/最大值），用随机数将数组填满之后遍历数组打印每一个元素
        //（1）要用键盘录入数组长度/最小值/最大随机数，要创建Scanner对象

        Scanner sc=new Scanner(System.in);
        System.out.println("创建一个数组长度");
        int arrayLength = sc.nextInt();
        System.out.println("输入最小随机数");
        int minBound = sc.nextInt();
        System.out.println("输入最大随机数");
        int maxBound = sc.nextInt();

        //（2）创建一个指定长度数组，动态初始化
        int[] intArray=new int[arrayLength];
        //（3）要使用随机数组填充数组的内容，创建随机数组对象Random对象
        Random r=new Random();

        //遍历数组，通过索引来给数组中的每一个元素赋值（通过随机数对象生成符合范围的随机数）
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt(maxBound-minBound+1)+minBound;
            System.out.println(intArray[i]);


        }




    }
}
