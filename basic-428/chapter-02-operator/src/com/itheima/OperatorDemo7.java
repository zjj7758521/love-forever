package com.itheima;

public class OperatorDemo7 {
    public static void main(String[] args) {

        //字符的运算操作：在之前将char基本类型总结到了数值类型基本类型中，本质上char只是一个字符而已
        //字符在计算机中的存储方式为二进制，对应的是0和1
        //字符转换为二进制的方式：数字；给字符一个对应的数字 '我'->100 ->100的二进制
        //操作字符本质上就是操作字符在ASCII码表中对应的数字

        System.out.println('a'+ 10 );

        //记住常见的字符对应的十进制数字：'0'：48   'A':65   'a':97 剩余的以此类推，数字+1，例如：'b':97+1=98
    }
}
