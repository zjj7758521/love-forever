package com.itheima.upgradetest;

import java.util.Random;

public class TestDemo22 {
    public static void main(String[] args) {
        int[] arr=new int[5];

        Random random = new Random();


// 利用随机数生成5个范围为2-10（包含2和10）之间的整数存入到数组中(随机数可重复)
       // ______________1_____________________
        for (int i = 0; i < 5; i++) {
            arr[i]=random.nextInt(9)+2;


        }
        //定义变量
        int max=arr[0];
        int min=arr[0];
        int sum=0;

        //求出最大值
        //______________2_____________________
        for (int i = 0; i <5; i++) {
            if(max<arr[i]){
                max = arr [i];
            }

            //求出最小值
          //  ______________3_____________________
            if(min>arr[i]){
                min=arr[i];
            }
            //求累加和
            for (int j = 0; j < 5; j++) {
                sum+=arr[j];
            }

        }

        //分别打印出最大值、最小值以及数组总和到控制台
        System.out.println();
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("累加和为："+sum);



    }
}

