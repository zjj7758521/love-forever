package com.itheima.method;

public class MethodDemo8 {
    public static void main(String[] args) {
        int[] arr={10,12,34,56,34};
        int number=72;
        int getElementNumber=getElement(arr,number);
        System.out.println("目标值number"+number+"在数组中的索引是："+getElementNumber);

    }

    //卫函数
    //案例，定义一个方法，方法需要一个int[] 数组作为参数，还需要一个int类型的数字作为参数，返回数字在数组中第一次出现索引值，若没有则返回-1.
    public static int getElement(int[] arr,int number){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                index =i ;
            }

        }//不用卫函数怎么写呢？？？？原来这样写⚠️⚠️⚠️
        return index;
    }
}
