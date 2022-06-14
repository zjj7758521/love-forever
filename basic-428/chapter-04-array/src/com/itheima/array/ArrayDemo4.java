package com.itheima.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //数据类型[] 数组名称 = {元素1，元素2，元素3...元素n}；
        // 静态初始化简化格式（只指定数组内元素的 内容）⚠️⚠️⚠️⚠️不确定需要存储的数组的个数的时候，只确定什么内容的时候用静态

        //创建一个int类型的数据，可以存储多个int数据（100，200，300），名称为arrayOne.
        //创建数组的时候，长度可以写常量；

        int numberOne=100;
        int[] arrayOne={numberOne,200,300};


        boolean[] arrayTwo={true,true,true,false};



        double[] arrrThree=new double[]{1.1,2.2,3.3};


        char[] arrayFour=new char[]{'真','的','好','想','你'};
    }
}
