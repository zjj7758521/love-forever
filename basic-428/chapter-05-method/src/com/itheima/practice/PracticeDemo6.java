package com.itheima.practice;


import java.util.Random;

public class PracticeDemo6 {
    public static void main(String[] args) {
        //方法练习题6:定义一个方法,方法可以创建一个指定长度的int数组,并且使用随机数将数组填充满之后返回并打印数组元素内容
        int getArray;


    }

    public static void getArray(int[] arr){

        int[] intArray=new int[arr.length];
        Random r=new Random();

        for (int i = 0; i < intArray.length; i++) {
            int a = r.nextInt(10);
            System.out.println("intArray[i]");



        }
        System.out.println("打印随机数组元素");



    }



}



