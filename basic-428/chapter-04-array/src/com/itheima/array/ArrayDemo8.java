package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //案例：使用键盘录入给数组中的每一个元素赋值
        Scanner sc=new Scanner(System.in);
        int[] intArray=new int[5];

        //其实赋值的操作和遍历取值的操作是一样的，还是要能够拿到表示数组每一个元素的索引
        for (int i=0;i<5;i++){
            System.out.println("请您输入数组中"+i +"索引的元素值：");
            int element = sc.nextInt();
            intArray[i]=element;
        }

        for (int i=0;i<5;i++){
            System.out.println("数组中"+i+"索引的元素值是："+intArray[i]);
        }
    }
}
