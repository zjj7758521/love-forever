package com.itheima.for循环;

public class ForDemo7_2 {
    public static void main(String[] args) {
        //打印四叶玫瑰数

        int count =0;
        for(int a = 1000;a <=9999;a++){
            int q = a/1000 %10;
            int b = a/100 %10;
            int s = a/10 %10;
            int g = a/1 %10;
            if (q*q*q*q+b*b*b*b+s*s*s*s+g*g*g*g ==a){
                count++;
                System.out.println("数字"+a+"就是一个玫瑰四叶数！");
            }
        }
        System.out.println("玫瑰四叶数的个数是："+count+"个！");
    }
}
