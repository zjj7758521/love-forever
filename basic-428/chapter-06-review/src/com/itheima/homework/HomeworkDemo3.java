package com.itheima.homework;

public class HomeworkDemo3 {
    public static void main(String[] args) {
        //作业练习3需求：	有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和，
        //    要求是：求和的元素个位和十位都不能是7，并且只能是偶数
        /*
        分析：
         （1）定义一个静态数组，锁定元素具体内容
         （2）求元素和，遍历数组获得每一个元素
         （3）遍历数组过程中，假设if条件筛选符合"元素个位和十位都不能是7，并且只能是偶数"的元素，⚠️⚠️⚠️使用砍位取余法，要求是偶数的话余数就是为0
         */
        int[] intArray=new int[]{68,27,95,88,171,996,51,210};//定义静态数组
        int sum=0;//定义变量sum，方便接下来的数据相加
        //遍历数组：通过索引来获得每一个元素值，符合条件的再赋值+=给sum

        for (int i = 0; i < intArray.length; i++) {


            if(intArray[i ]/10%10!=7&&intArray[i ]%10!=7&&intArray[i ]%2==0){
                sum+=intArray[i ];//求和必须写在里面，才能符合要求的元素相加


            }


        }System.out.println("该数组中满足要求的元素和是"+sum);//for循环之后再开始打印才是所有符合条件的元素之和


    }
}
