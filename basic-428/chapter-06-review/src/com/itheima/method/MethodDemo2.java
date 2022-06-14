package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //⚠️⚠️⚠️同一个类中，方法名相同，参数列表不同的方法构成重载：起同一个方法名
        //（1）将目的相同的多个方法改成同一个方法名--->求和--> getSum⚠️
        //（2）参数列表不同：参数列表不同的意义就是为了让Java虚拟机分辨到底要调用的是哪一个方法（根据调用方法时传递的参数自动分辨调用）


        getSum(10,20);
        getSum(20,30,40);
        getSum(22.22,33.33);

        //例：打印内容的时候，println方法就是一个重载方法，会自动根据传递的数据找到对应的方法进行调用
        System.out.println(10);

    }

    /*
需求1：编写一个方法，方法可以计算出2个int数据的和并打印到控制台
方法三要素：方法名称
参数列表
返回值类型
 */
    public static void getSum(int a,int b) {
        System.out.println("a+b的和是："+(a+b));

    }

    //需求2：编写一个方法，方法可以计算出3个int数据的和并打印到控制台
    public static void getSum(int a,int b,int c) {
        System.out.println("a+b的和是："+(a+b+c));
    }

    //需求3：编写一个方法，方法可以计算出2个double数据的和并打印到控制台
    public static void getSum(double a,double b) {
        System.out.println("a+b的和是："+(a+b));

    }
}
