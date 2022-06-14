package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        getSum(10,20);
        getThreeeNumberSum(10,20,30);
        getTwoDoubleNumberSum(11.1,22.2);

        //所编写的三个方法最终的目的都是求和，但是方法名称不一样，就会让调用者的学习成本增加（知道类里面有计算变量和的方法，找到合适的方法）

        //既然都是为了求和，为了降低调用者的学习成本===》方法重载来解决这个问题（当多个方法的目的一致的时候，但方法名称不一样的时候）



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
    public static void getThreeeNumberSum(int a,int b,int c) {
        System.out.println("a+b的和是："+(a+b+c));
    }

    //需求3：编写一个方法，方法可以计算出2个double数据的和并打印到控制台
    public static void getTwoDoubleNumberSum(double a,double b) {
        System.out.println("a+b的和是："+(a+b));

    }


}
