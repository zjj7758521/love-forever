package com.itheima.for循环;

public class ForDemo6_2 {
    public static void main(String[] args) {
        //作业练习（3）：打印出1到100之间的既是3的倍数又是5的倍数的数字，以及这些数字的和实现步骤；

        int sum =0;
        //for代表的是循环语句，需求"打印出1到100之间的既是3的倍数又是5的倍数的数字"需要使用循环语句，注意和if语句（选择语句区分开来）⚠️⚠️
        for  (int a=1;a<=100;a++ ){
            //for循环语句里是可以加入if选择语句的⚠️⚠️⚠️
            if(a%3==0&&a%5==0){
                //⚠️⚠️⚠️⚠️这里不要忘了将a的值赋给sum,即sum=sum+a,多次循环的数字都会加上的哦
                sum +=a ;
                System.out.println("数字"+a+"是一个既是3的倍数又是5的倍数的数字！");
            }

        }
        System.out.println("既是3的倍数又是5的倍数的数字的和是"+sum);
    }
}
