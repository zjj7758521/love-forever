package com.itheima.array;

public class ArrayDemo12 {
    public static void main(String[] args) {
        //案例：数组最大值的获取
        int[] intArray=new int[]{10,20,30,40,50};


        int max =intArray[0];

        for (int i = 1; i < intArray.length; i++) {
           if(intArray[i]>max){
               max=intArray[i];
           }
        }
        System.out.println("数组中的元素最大值是："+max);
    }
}
