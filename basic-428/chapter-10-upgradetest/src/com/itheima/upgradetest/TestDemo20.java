package com.itheima.upgradetest;

import java.util.Random;

public class TestDemo20 {
    public static void main(String[] args) {

        int[] arr=new int[5];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int ss=r.nextInt(99-1+1)+1;
            arr[i]=ss;
        }

        int sss=getScore(arr);
        System.out.println(sss);

    }


    public static int getScore(int[] arr){
        int sum=0;
        int count=0;
        int avg=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(i==arr.length-1){
                avg=sum/arr.length;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]>avg){
                        count++;
                    }

                }
            }
        }
        return count;

    }


}
