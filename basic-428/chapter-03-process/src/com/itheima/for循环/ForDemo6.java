package com.itheima.for循环;

public class ForDemo6 {
    public static void main(String[] args) {
        //求1—100之间的所有是3的倍数的数字的数据和并把数据打印到控制台；

        //求和思想说明：要写在循环语句外面

        int sum = 0;
        for (int a= 1;a <=100;a++){
            if (a % 3 == 0){
                sum +=a ; //sum = sum+a
            }
        }
        System.out.println("1—100之间的所有是3的倍数的数字的数据和是："+ sum);


        System.out.println("=-=-=");
        //求1—100之间的所有是3的倍数,也是5的倍数的数字的数据和并把数据打印到控制台；
        int sumOne = 0;
        for (int a =1;a <=100;a++){
            if(a % 3 ==0 && a % 5==0){
                sumOne +=a;
            }

        }
        System.out.println("1—100之间的所有是3和5的倍数的数字的数据和是："+sumOne);


        //⚠️for循环语句中是可以加入if选择语句的



    }



}
