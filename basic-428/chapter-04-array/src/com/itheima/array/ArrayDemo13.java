package com.itheima.array;

public class ArrayDemo13 {
    public static void main(String[] args) {
        //案例：数组最小值的获取
        int[] intArray=new int[]{12,20,30,6,2};

        int min=intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i]<min){
                min=intArray[i];
            }

        }
        System.out.println("数组中的元素最小值是："+min);

        //获取最大值和获取最小值的核心思想：将0索引为假定的最大值/最小值，从1索引依次和每一个元素对比，如果满足了大于最大值/小于最小值的情况，则让值记录当前的元素内容//
    }
       //注意：⚠️正常情况下将0索引作为了最大值/最小值，遍历的时候从1索引开始，但是实际上从0开始和从1开始没有区别，从0开始多遍历一次没有任何意义，不需要和自己做比较

}
