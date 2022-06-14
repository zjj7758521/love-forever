package com.itheima.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //数据类型[] 数组名称 = new 数据类型[长度]；动态初始化（只指定数组的长度）⚠️⚠️⚠️⚠️只确定需要存储的数组的个数的时候，不确定什么内容的时候用动态
        //⚠️⚠️⚠️注意事项：创建完成后的数组里面是有内容的（系统给出的默认值int:0;   double:0.0; char:空字符；  boolean:false;)


        //创建一个int类型的数据，可以存储3个int数据，名称为arrayOne.
        //创建数组的时候，长度可以写常量；
        int[] arrayOne=new int[3];

        //⚠️⚠️⚠️⚠️创建数组的时候，长度为o或者1的话都是可以的；但是不可以为负数，例如（-1）；（如果是负数在运行代码的时候会出现错误）
        boolean[] arrayTwo=new boolean[1];
        boolean[] arrayFive=new boolean[0];

        //创建数组的时候，长度也可以写变量；
        int length=7;
        double[] arrrThree=new double[length];

        //创建数组的时候，长度也可以写表达式也是没有问题的（int数字）
        char[] arrayFour=new char[3+2];



    }
}
