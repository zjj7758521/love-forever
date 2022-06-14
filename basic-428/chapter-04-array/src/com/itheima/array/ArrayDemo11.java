package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo11 {
    public static void main(String[] args) {
        //案例：输入长度创建一个指定长度的数组后，给数组中的元素进行键盘录入赋值，将数组中所有大于10并且是4的倍数的元素进行求和以及计数，最终打印结果
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入要创建的数组的长度：");
        int length = sc.nextInt();//直接将length作为数组动态初始化的长度

        int[] intArrary=new int[length];

        //遍历数组通过i索引，给每一个元素赋值
        for(int i=0;i <intArrary.length;i++){
            System.out.println("请您输入" + i + "索引元素的值：");
            intArrary[i ] = sc.nextInt();//此方法调用后会返回输入的数据，直接将数据赋值给i索引的元素
        }

        //求和思想，计数器思想
        int elementSum=0;
        int elementCount=0;

        //遍历数组，获取到数组中的每一个元素进行判断，如果符合要求则累加并且计数
        for (int i=0;i<intArrary.length;i++){
            if (intArrary[i ]>10&&intArrary[i ]%4==0){
                elementSum+=intArrary[i ];
                elementCount++;
            }
        }
        System.out.println("数组中满足要求的元素有"+elementCount+"个，它们的和是"+elementSum+'！');


    }
}
